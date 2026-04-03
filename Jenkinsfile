pipeline {
    agent { label 'agent1' }
    stages {
        stage('Compile') {
            steps {
                sh 'echo "run mvn clean compile"'
            }
        }

        stage('Test') {
            steps {
                sh 'echo "run mvn test"'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo "run mvn spring-boot:run &"'
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
        always {
            mail to: 'akdirtawfiq.com',
                 subject: "Status: ${currentBuild.fullDisplayName}",
                 body: "Build ${env.BUILD_NUMBER} finished with ${currentBuild.currentResult}. View at ${env.BUILD_URL}"
        }
    }
}
