@Library("pipeline-shared-library") _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    swissknife.printName "Alexandre"
                }
            }
        }
    }
}