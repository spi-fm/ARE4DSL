# ARE4DSL 
# Augmented Reality Editors for Domain Specific Languages
**A framework to develop model editors based on augmented reality** 

## Intro
Modeling languages allow experts to establish a common and shared vocabulary for either a particular domain or several ones. Designing visual models usually demands qualified people with spatial and abstraction skills. Many people may train these abilities, but others can develop different skills according to other learning styles. Bodily-kinesthetic intelligence is an special ability in which individuals are able to use their entire body or parts of it to handle objects and control motions successfully. However, common modeling tools do not allow users to leverage these skills. This Github page presents a model-driven framework to automatically develop spatial visual editors to work with domain specific languages. These editors are achieved by means of augmented reality technologies, which enable to track physical objects and create a mixed reality in real time. 

The framework provides a systematic [approach](#Method) for the design and deployment of AR editors, a dedicated metamodel and some support tools. The generated editors are Android mobile apps based on [Unity](https://unity3d.com), the popular game development platform, along with [Vuforia](https://www.vuforia.com/), a widely used AR development kit.

## ARE4DSL in action (soon)
[![IMAGE ALT TEXT](http://img.youtube.com/vi/DGiMIKQ32eU/0.jpg)](http://www.youtube.com/watch?v=DGiMIKQ32eU "Video Title")
     
## Method
In order to create domain-specific modeling workbenches based on RA, a number of steps must be carried out:

1. Define the abstract syntax of the DSL: This step is usually implemented by means of a metamodeling language such as [Ecore](https://www.eclipse.org/modeling/emf/).

2. Design the concrete syntax of the DSL: A specific metamodel to design the notation of the DSLs to be used in a AR-based editor has been defined.
 
3. Generate the support editor: DSL developers must use the tools described below to automatically generate a dedicated editor based on AR
    
4. Define the language semantics: This step can be performed in different ways, for example, by generating source codewith [Acceleo](http://www.eclipse.org/acceleo).

## Tools
Soon...

## Downloads
Two mobile app for Android devices will be shortly available to edit models using augmented reality features. 

* State Machine model editor (apk file)
* Entity-Relationship model editor (apk file)


## About
This framework has been developed by the [SPI-FM research group](http://tic195.uca.es/) at [University of Cádiz](http://www.uca.es)

Project leader: [Iván Ruiz](https://github.com/ruizrube)

Developer: [Pablo Mariscal](pablo.mariscalmartinez@alum(DOT)uca(DOT)es) 

Project Testers:
[José Miguel Mota](https://github.com/josemiguelmota) and [Juan Manuel Dodero](https://github.com/dodero)


## Software License
This project licence is Eclipse Public License [(EPL-1.0).](https://www.eclipse.org/legal/epl-v10.html)
