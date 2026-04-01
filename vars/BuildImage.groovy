#!/user/bin/env groovy
def call() {
    echo("building the docker image...")
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
        sh 'docker build -t petrdeveloper/demo-app:jma-1.2 .'
        sh 'echo $PASSWORD | docker login -u $USER --password-stdin'
        sh 'docker push petrdeveloper/demo-app:jma-1.2'
    }
}