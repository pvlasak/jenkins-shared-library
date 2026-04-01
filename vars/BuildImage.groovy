#!/user/bin/env groovy
def call(String ImageName) {
    echo("building the docker image...")
    withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', passwordVariable: 'PASSWORD', usernameVariable: 'USER')]) {
        sh "docker build -t $ImageName ."
        sh 'echo $PASSWORD | docker login -u $USER --password-stdin'
        sh "docker push $ImageName"
    }
}