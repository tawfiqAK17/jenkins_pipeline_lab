pipeline {

    agent none

    stages {
        stage('Compile') {
            agent { label 'agent1' }
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            agent { label 'agent1' }
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            agent { label 'agent1' }
            steps {
                sh 'mvn spring-boot:run &'
            }
        }
    }

    post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
