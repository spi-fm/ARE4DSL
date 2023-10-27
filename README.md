# ARE4DSL 
# Augmented Reality Editors for Domain Specific Languages

This framework is explained on the paper: **Model-driven development of augmented reality-based editors for domain specific languages** available at: https://ixdea.org/45_11/

## Intro
Modeling languages allow experts to establish a common and shared vocabulary for either a particular domain or several ones. Designing visual models usually demands qualified people with spatial and abstraction skills. Many people may train these abilities, but others can develop different skills according to other learning styles. Bodily-kinesthetic intelligence is an special ability in which individuals are able to use their entire body or parts of it to handle objects and control motions successfully. However, common modeling tools do not allow users to leverage these skills. This Github page contains the resources of a model-driven framework to develop model editors to work with domain specific languages. These editors are achieved by means of augmented reality technologies, which enable to track physical objects and create a mixed reality in real time. 

The framework provides a systematic [approach](#Method) for the design and deployment of AR editors, a dedicated metamodel and some support tools. The generated editors are Android mobile apps based on [Unity](https://unity3d.com), the popular game development platform, along with [Vuforia](https://www.vuforia.com/), a widely used AR development kit.

## Proof-of-concept
Tap the image for watching a video of an entity-relationship model editor based on Augmented Reality...
[![IMAGE ALT TEXT](https://github.com/spi-fm/ARE4DSL/blob/master/img/demo.png)](https://www.youtube.com/watch?v=DMU6TSxY5DE "An entity-relationship model editor based on Augmented Reality")


     
## Method
In order to create domain-specific modeling workbenches based on RA, a number of steps must be carried out:

1. Define the abstract syntax of the DSL: This step is usually implemented by means of a metamodeling language such as [Ecore](https://www.eclipse.org/modeling/emf/).

2. Design the concrete syntax of the DSL: A specific [metamodel](https://github.com/spi-fm/ARE4DSL/blob/master/aredsl/model/aredsl.ecore) to design the notation of the DSLs to be used in a AR-based editor has been defined.
 
3. Generate the support editor: DSL developers must use the [tools](https://github.com/spi-fm/ARE4DSL#tools) described below to automatically generate a dedicated editor based on AR
    
4. Define the language semantics: This step can be performed in different ways, for example, by generating source code for a target platform.

## Tools

### Unity3d Extension

Assuming you know the foundations of programing with Unity3D, a blank project must be created:

1. Once you are in the new project, create the folder "/Assets/Editor" and put inside the files provided in this [folder](https://github.com/spi-fm/ARE4DSL/tree/master/unity.editor). You can locate there a JAR file with the acceleo module and a DLL file.

2. The "ARE4DSL" option will now appear in the top menu of Unity3D. Click on the "Generate Folders" option and the folder structure required for the next step will be created.

<img src="https://github.com/spi-fm/ARE4DSL/blob/master/img/tools_3.png" width="500">

3. Once you are sure that the folders have been created correctly, look for the folder "Assets/Aredsl/Model" and put the XMI file with the concrete syntax of your new DSL.

4. Put the ecore file of [AREDSL](https://github.com/spi-fm/ARE4DSL/blob/master/aredsl/model/aredsl.ecore) as well as the ecore file of the abstract syntax of your DSL in the folder "Assets/Aredsl/Meta_models/sources".

5. Once all the previous steps have been completed, the "Generate Editor" option must be selected in the "Aredsl" menu, creating in the project scene the necessary GameObjects and a backup of these in the "Assets/Aredsl/Prefabs" folder.

<img src="https://github.com/spi-fm/ARE4DSL/blob/master/img/tools_5.png" width="250">
<img src="https://github.com/spi-fm/ARE4DSL/blob/master/img/tools_6.png" width="250">

After the execution of these modules we will obtain a set of GameObject, which will be formed by the scripts and visual objects necessary for their representation and use.


## An Entity-Relationship Model editor with Augmented Reality 

* Android app ([APK file](https://github.com/spi-fm/ARE4DSL/blob/master/ermodeleditor/ERModelEditor.apk)) for creating Entity Relationship Models using Augmented Reality 
* Source code of the mobile app [Unity package](https://github.com/spi-fm/ARE4DSL/blob/master/ermodeleditor/ERModelEditor.unitypackage)
* Augmented Reality [Markers](https://github.com/spi-fm/ARE4DSL/blob/master/ermodeleditor/markers.pdf) to print
* [Results](https://github.com/spi-fm/ARE4DSL/blob/master/ermodeleditor/Usability%20study%20data.xlsx) of the study conducted in the context of the 20th International Symposium on Computers in Education (SIIE). 



## About
This framework has been developed by the [SPI-FM research group](http://tic195.uca.es/) at [University of Cádiz](http://www.uca.es)

Project researchers: 
* [Iván Ruiz](https://github.com/ruizrube)
* [Rubén Baena Pérez](https://github.com/lordrubenbp)
* [José Miguel Mota](https://github.com/josemiguelmota) 
* [Juan Manuel Dodero](https://github.com/dodero)
* [Inmaculada Arnedillo](https://www.tcd.ie/research/profiles/?profile=arnedii)

Mobile app developer: 
[Pablo Mariscal](pablo.mariscalmartinez@alum(DOT)uca(DOT)es) 


## Software License
This project licence is Eclipse Public License [(EPL-1.0).](https://www.eclipse.org/legal/epl-v10.html)
