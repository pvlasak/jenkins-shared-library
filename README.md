# Jenkins Shared Library

- inside the `src` directory a class and its methods are defined
- in `vars` the call functions are defined to create an interface between the Jenkinsfile and the class 
- shared library can be linked with Jenkins server in Settings - Manage - System - Global Trusted Pipeline Libraries or locally inside the Jenkinsfile: <br>

*library identifier: 'jenkins-shared-library@main', retriever: modernSCM(* <br>
    *[$class: 'GitSCMSource',* <br>
     *remote: 'https://github.com/pvlasak/jenkins-shared-library.git',* <br>
     *credentialsId: 'github-credentials'])* <br>
