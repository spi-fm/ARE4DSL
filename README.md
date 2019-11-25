# ARE4DSL 
# Augmented Reality Editors for Domain Specific Languages
**A framework to develop model editors based on augmented reality** 

## Intro
Modeling languages allow experts to establish a common and shared vocabulary for either a particular domain or several ones. Designing visual models usually demands qualified people with spatial and abstraction skills. Many people may train these abilities, but others can develop different skills according to other learning styles. Bodily-kinesthetic intelligence is an special ability in which individuals are able to use their entire body or parts of it to handle objects and control motions successfully. However, common modeling tools do not allow users to leverage these skills. This Github page presents a model-driven framework to automatically develop spatial visual editors to work with domain specific languages. These editors are achieved by means of augmented reality technologies, which enable to track physical objects and create a mixed reality in real time. 

The framework provides a systematic [approach](#Method) for the design and deployment of AR editors, a dedicated metamodel and some support tools. The generated editors are Android mobile apps based on [Unity](https://unity3d.com), the popular game development platform, along with [Vuforia](https://www.vuforia.com/), a widely used AR development kit.

## ARE4DSL in action (soon)
[![IMAGE ALT TEXT](http://img.youtube.com/vi/DGiMIKQ32eU/0.jpg)](https://www.youtube.com/watch?v=DMU6TSxY5DE "An entity-relationship model editor based on Augmented Reality
")
     
## Method
In order to create domain-specific modeling workbenches based on RA, a number of steps must be carried out:

1. Define the abstract syntax of the DSL: This step is usually implemented by means of a metamodeling language such as [Ecore](https://www.eclipse.org/modeling/emf/).

2. Design the concrete syntax of the DSL: A specific metamodel to design the notation of the DSLs to be used in a AR-based editor has been defined.
 
3. Generate the support editor: DSL developers must use the tools described below to automatically generate a dedicated editor based on AR
    
4. Define the language semantics: This step can be performed in different ways, for example, by generating source codewith [Acceleo](http://www.eclipse.org/acceleo).

## Tools

In order to generate the editor that supports the concrete syntax, two modules have been developed that work together. After the execution of these two modules we will obtain the mentioned editor formed by a set of GameObject, which will be formed by the scripts and visual objects necessary for their representation and use

### Module to convert abstract syntax of the DSL to C# code adapted to Unity3d (by Acceleo)

Assuming that it is known as creating an Acceleo-type project with Eclipse and exporting a project as an executable jar file, the following steps have been followed:

1. Create an Acceleo-type Eclipse project and use as DSL the one provided by AREDSL (aredsl.ecore).
2. Modify the available template so that once we execute the project, source code of type C# compatible with Unity3D is generated.
3. Copy the file "generate.emtl" from the folder "bin/[project_name]/main" to "src/[project_name]/main". This step is necessary for the executable jar 	file we generate to work.
4. Finally, we export the project as an executable jar file, obtaining the first of the necessary modules.


### Module to generate an editor based on a concrete syntax

Assuming you know how to create a project in Unity3D, the following steps have been followed:

1. Once in our new project, create the folder "/Assets/Editor" and put inside the file "Unity3D module/Aredsl.cs" provided in the repository.
2. Search the top menu of Unity3D and the "Aredsl" option will now appear. Click on the "Generate Folders" option and the necessary folder structure will be created.
3. Once you are sure that the folders have been created correctly, look for the folder "Assets/Aredsl/Model" and put the file with the concrete syntax.
4. Put the abstract syntax file of aredsl and the chosen domain in the folder "Assets/Aredsl/Meta_models/sources".
5. Put the Acceleo module in "jar" format previously generated inside "Assets/Aredsl/modules", as well as the module "Newtonsoft.Json.dll".
6. Once all the previous steps have been completed, the "Generate Editor" option must be selected in the "Aredsl" menu, creating in the project scene the necessary GameObjects and a backup of these in the "Assets/Aredsl/Prefabs" folder.

## Downloads
A mobile app for Android devices using augmented reality features will be shortly available to edit models:  

* State Machine models
* Entity-Relationship models


## About
This framework has been developed by the [SPI-FM research group](http://tic195.uca.es/) at [University of Cádiz](http://www.uca.es)

Project leader: [Iván Ruiz](https://github.com/ruizrube)

Project researchers: 
[José Miguel Mota](https://github.com/josemiguelmota) and [Juan Manuel Dodero](https://github.com/dodero)

Project developer: [Pablo Mariscal](pablo.mariscalmartinez@alum(DOT)uca(DOT)es) and [Rubén Baena Pérez](https://github.com/lordrubenbp)


## Software License
This project licence is Eclipse Public License [(EPL-1.0).](https://www.eclipse.org/legal/epl-v10.html)