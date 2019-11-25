
using UnityEngine;
using UnityEditor;
using System.Diagnostics;
using System.IO;
using System.Linq;
using Newtonsoft.Json.Linq;
using System.Xml;
using Newtonsoft.Json;
using System;
using System.Collections;
using System.Reflection;
using Object = System.Object;
using Debug = UnityEngine.Debug;
using System.Collections.Generic;
using System.Text.RegularExpressions;

public class Aredsl
{
    
    [MenuItem("Aredls/Generate Folders")]
    static void CreateFolders()
    {
        string[] folders = new string[5];
        folders[0]=System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/classes/";
        folders[1] =System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/sources/";
        folders[2] =System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/modules/";
        folders[3] = System.Environment.CurrentDirectory + "/Assets/Aredsl/Model/";
        folders[4] = System.Environment.CurrentDirectory + "/Assets/Aredsl/Prefabs/";

        foreach (string folder in folders)
        {
            if (!Directory.Exists(folder))
            {
                System.IO.Directory.CreateDirectory(folder);
            }
        }
        
    }
    [MenuItem("Aredls/Generate Editor")]
    static void CreateEditor()
    {
        string[] fileArray = Directory.GetFiles(@System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/sources/", "*.ecore");
       
       

        foreach (string file in fileArray)
        {
           
            //UnityEngine.Debug.Log(Path.GetFileName(file));
            string folderPath = System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/classes/"+ Path.GetFileNameWithoutExtension(file);
            CreateMetaModelsClasses(Path.GetFileName(file), folderPath);
         
        }

        CreateEditorGameObjects();





    }
    static void CreateMetaModelsClasses(string metaModelName, string folderPath)
    {

        if (!Directory.Exists(folderPath))
        {
            System.IO.Directory.CreateDirectory(folderPath);
        }

        Process myProcess = new Process();
        myProcess.StartInfo.UseShellExecute = true;
        myProcess.StartInfo.FileName = @"java";
        myProcess.StartInfo.Arguments = "-jar " + System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/modules/acceleo.jar " + System.Environment.CurrentDirectory + "/Assets/Aredsl/Meta_models/sources/" + metaModelName+" " + folderPath;
        myProcess.Start();
        myProcess.WaitForExit();


    }
    static JObject Xmi2Json()
    {
        //string fileArray = Directory.GetFiles(@System.Environment.CurrentDirectory + "/Assets/Aredsl/Model/", "*.xmi")[0];

        string text = System.IO.File.ReadAllText(Directory.GetFiles(@System.Environment.CurrentDirectory + "/Assets/Aredsl/Model/", "*.xmi")[0]);

        text.Replace("@", "_");
        XmlDocument doc = new XmlDocument();
        doc.LoadXml(text);

        string json = JsonConvert.SerializeXmlNode(doc);

        string hola = json.Replace("@", "_").Replace("aredsl:", "").Replace("_xsi:", "");

        JObject jsonObject = (Newtonsoft.Json.Linq.JObject)JsonConvert.DeserializeObject(hola);

        jsonObject.Remove("?xml");
        JObject editor = (Newtonsoft.Json.Linq.JObject)jsonObject["Editor"];
        editor.Remove("_xmi:version");
        editor.Remove("_xmlns:xmi");
        editor.Remove("_xmlns:xsi");
        editor.Remove("_xmlns:aredsl");

        return editor;
    }
    /*
     * Function that receives a JSON and converts it into Unity gameobjects.
     */
    static void JsonToGameObject(Object script, GameObject gameObject, JObject jObject)
    {
        //captures all properties of the main JSON object
        foreach (JProperty jproperty in jObject.Properties())

        {

            
            string propertyType = jproperty.Value.GetType().Name;

            //depending on the type of value of the property...
            switch (propertyType)
            {
                case "JValue":
                    if (jproperty.Name.ToString().Equals("_id"))
                    {
                        string[] words = Regex.Split(jproperty.Value.ToString(), @"(?<!^)(?=[A-Z])");

                        if (words[words.Length - 1].Equals("Node"))
                        {
                            //RELATIONSHIP NAME HAVE A BUG IN THE NAME OF METAMODELS
                            Debug.Log(words[words.Length - 2]);
                            gameObject.AddComponent(Type.GetType(words[words.Length - 2] + ",Assembly-CSharp"));

                        }
                    }

                    //the property "type", this reserved for the classes that inherit of other, reason why they are not treated
                    if (!jproperty.Name.ToString().Equals("type"))
                    {

                        
                        FieldInfo jValue_fieldInfo;
                        Type jValue_type;
                        //properties that have a primitive value begin with "_", those that are not references
                        try
                        {
                            jValue_fieldInfo = script.GetType().GetField(jproperty.Name.ToString());
                            jValue_type = jValue_fieldInfo.FieldType;
                        }
                        catch
                        {
                            jValue_fieldInfo = script.GetType().GetField(jproperty.Name.ToString().Replace("_", ""));
                            jValue_type = jValue_fieldInfo.FieldType;
                        }


                        //When you already know the type of property value...
                        if (jValue_type == typeof(string))
                        {
                            script.GetType().GetField(jproperty.Name.ToString()).SetValue(script, jproperty.Value.ToString());
                        }
                        else if (jValue_type == typeof(int))

                        {

                            script.GetType().GetField(jproperty.Name.ToString()).SetValue(script, jproperty.Value.ToObject<int>());
                        }
                        else if (jValue_type.IsEnum)
                        {
                            string valor = jproperty.Value.ToString();
                            //Debug.Log(valor);
                            script.GetType().GetField(jproperty.Name.ToString()).SetValue(script, Enum.Parse(jValue_type, valor));
                        }

                        //When the value is a reference to another gameobject already created...
                        else
                        {

                            string jProperty_value = jproperty.Value.ToString();
                            if (!jProperty_value.Equals(""))
                            {
                                //I look for the object among all the gameobjects already created
                                object[] obj = GameObject.FindObjectsOfType(jValue_type);
                                foreach (dynamic o in obj)
                                {


                                    if (jProperty_value.Equals(o._id))
                                    {
                                        
                                        script.GetType().GetField(jproperty.Name.ToString().Replace("_", "")).SetValue(script, o);
                                        break;
                                    }
                                }

                              
                            }
                        }






                    }

                    break;
                case "JArray":

                    //if the value of the property is a JArray..
                    JArray jArray_jObjects = (JArray)jproperty.Value;

                    FieldInfo jArray_fieldInfo;

                    //create a list of the type of objects contained in the array

                    IList jArray_list;
                    
                    Type jArray_type;

                    jArray_fieldInfo = script.GetType().GetField(jproperty.Name.ToString());


                    Type jArray_type_list = jArray_fieldInfo.FieldType;

                    object jArray_instance_list = Activator.CreateInstance(jArray_type_list);
                    jArray_list = (IList)jArray_instance_list;

                    //I go through the objects that the array has and I introduce them in the list

                    foreach (JObject arrayObject in jArray_jObjects)
                    {

                        GameObject jArray_child = new GameObject(jArray_list.GetType().GenericTypeArguments[0].ToString().ToLower() + "_" + arrayObject.GetValue("_id"));
                        jArray_child.transform.parent = gameObject.transform;
                        if (arrayObject.ContainsKey("type"))
                        {

                            jArray_type = Type.GetType(arrayObject.GetValue("type").ToString() + ",Assembly-CSharp");
                        }
                        else
                        {
                            jArray_type = Type.GetType(jArray_list.GetType().GenericTypeArguments[0].ToString() + ",Assembly-CSharp");
                        }

                        jArray_child.AddComponent(jArray_type);
                        jArray_list.Add(jArray_child.GetComponent(jArray_type));

                        //I go through each of these objects in a recursive way...
                        JsonToGameObject(jArray_child.GetComponent(jArray_type), jArray_child, arrayObject);

                    }
                    //finally when all objects have been created and entered in the list...
                    script.GetType().GetField(jproperty.Name.ToString()).SetValue(script, jArray_list);


                    break;
                case "JObject":
                    //if the property value is a JObject...

                    JObject jObject_value = (JObject)jproperty.Value;
                    GameObject jObject_child = new GameObject(jproperty.Name.ToString() + "_" + jObject_value.GetValue("_id"));
                    jObject_child.transform.parent = gameObject.transform;
                    Type jObject_type;
                    FieldInfo jObject_fieldType;

                    //when the property contains another game object, in the classes it is treated as lists, if this list only has one item...it is not treated as a JArray and that's why we are here. Anyway we'll have to treat it as a list
                    IList list;

                    jObject_fieldType = script.GetType().GetField(jproperty.Name.ToString());


                    Type t2 = jObject_fieldType.FieldType;

                    object jObject_instance_list = Activator.CreateInstance(t2);

                    try
                    {
                        //if it's a list...
                        list = (IList)jObject_instance_list;
                        if (jObject_value.ContainsKey("type"))
                        {

                            jObject_type = Type.GetType(jObject_value.GetValue("type").ToString() + ",Assembly-CSharp");
                        }
                        else
                        {
                            jObject_type = Type.GetType(list.GetType().GenericTypeArguments[0].ToString() + ",Assembly-CSharp");
                        }

                        jObject_child.AddComponent(jObject_type);
                        list.Add(jObject_child.GetComponent(jObject_type));
                        script.GetType().GetField(jproperty.Name.ToString()).SetValue(script, list);

                    }
                    catch
                    {
                        //if only reference to a single object...
                        if (jObject_value.ContainsKey("type"))
                        {

                            jObject_type = Type.GetType(jObject_value.GetValue("type").ToString() + ",Assembly-CSharp");
                        }
                        else
                        {
                            jObject_type = Type.GetType(t2.Name + ",Assembly-CSharp");
                        }

                        jObject_child.AddComponent(jObject_type);
                        script.GetType().GetField(jproperty.Name.ToString()).SetValue(script, jObject_child.GetComponent(jObject_type));
                    }

                    //Loop on the JObject that I just tried to continue deepening in the tree...
                    JsonToGameObject(jObject_child.GetComponent(jObject_type), jObject_child, (JObject)jproperty.Value);



                    break;
                default:

                    break;
            }




        }
    }
    static void CreateEditorGameObjects()
    {

        GameObject editor = new GameObject("editor");


        JObject test = Xmi2Json();
        Type EditorScriptType = Type.GetType("Editor" + ",Assembly-CSharp");

        editor.AddComponent(EditorScriptType);



        JsonToGameObject(editor.GetComponent(EditorScriptType), editor, test);

        string localPath = System.Environment.CurrentDirectory + "/Assets/Aredsl/Prefabs/" + editor.name + ".prefab";
        localPath = AssetDatabase.GenerateUniqueAssetPath(localPath);
        PrefabUtility.SaveAsPrefabAssetAndConnect(editor, localPath, InteractionMode.UserAction);
    }

    //[MenuItem("Custom/List All Scripts Objects in the Current Project")]
    public static void ListScriptObjects()
    {
        string[] assetPaths = AssetDatabase.GetAllAssetPaths();
        foreach (string assetPath in assetPaths)
        {
            if (assetPath.Contains(".cs")) // or .js if you want
            {
                Debug.Log(Path.GetFileName(assetPath));
            }
        }
    }
}