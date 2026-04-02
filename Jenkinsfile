properties([pipelineTriggers([githubPush()])])

pipeline {
    agent { label 'agent1' }
    stages {
        stage('Test') {
            steps {
                sh 'echo hello12'
            }
        }
    }
}
