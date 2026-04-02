#!/user/bin/env groovy
def call() {
    echo "building the application...building the application for $GIT_BRANCH"
    sh "mvn package"
}