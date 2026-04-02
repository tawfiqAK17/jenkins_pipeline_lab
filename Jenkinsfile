pipeline {
    agent { label 'agent1' }
    
    triggers {
        githubPush()
    }
    
    stages {
        stage('Test') {
            steps {
                sh 'echo hello9'
            }
        }
    }
}
