@Library("shared-library") _
pipeline {
    agent { any }
    stages {
        stage ('Example') {
            steps {
                helloWorld(dayOfWeek: 'Monday', name: 'Alexandre')
            }
        }
    }
}