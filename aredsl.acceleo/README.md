### Module to convert abstract syntax of the DSL to C# code adapted to Unity3d (by Acceleo)

Assuming that it is known as creating an Acceleo-type project with Eclipse and exporting a project as an executable jar file, the following steps have been followed:

1. Create an Acceleo-type Eclipse project and use as DSL the one provided by AREDSL (aredsl.ecore).

2. Modify the available template so that once we execute the project, source code of type C# compatible with Unity3D is generated.

<img src="https://github.com/spi-fm/ARE4DSL/blob/master/img/tools_1.png" width="400">


3. Copy the file "generate.emtl" from the folder "bin/[project_name]/main" to "src/[project_name]/main". This step is necessary for the executable jar 	file we generate to work.

<img src="https://github.com/spi-fm/ARE4DSL/blob/master/img/tools_2.png" width="250">


4. Finally, we export the project as an executable jar file, obtaining the first of the necessary modules.

