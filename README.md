# Jenkins Shared Library

- most of the logic can be same for multiple microservices - solution is **Jenkins Shared Library** written as `Groovy Code` sharing the logic, which can be referenced in the Jenkinsfile in different projects.
- inside the `src` directory contains a package com.example containing a groovy class and its methods are defined.
- groovy class using *class Docker implements Serializable {}* allowing saving a state if the pipeline is paused and resumed. 
- *script* variable holds all environmental variable, syntax - commands and methods from the Jenkins pipeline. All commands and env variables are executed using a *script*. 
- in `vars` the call functions are defined to create an interface between the Jenkinsfile and the class 
- call function create an instance of class defined in package com.example and passing the context of jenkinfile to a class through *this*
- shared library can be linked with Jenkins server in `Settings - Manage - System - Global Trusted Pipeline Libraries` and referenced in the Jenkinsfile: <br>

- Global reference when Jenkins Shared Library is configured in the settings of Jenkins Server: <br>
*@Library('jenkins-shared-library')*

- Or local reference without configuring the Jenkins server: <br>
*library identifier: 'jenkins-shared-library@main', retriever: modernSCM(* <br>
    *[$class: 'GitSCMSource',* <br>
     *remote: 'https://github.com/pvlasak/jenkins-shared-library.git',* <br>
     *credentialsId: 'github-credentials'])* <br>
