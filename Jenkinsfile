pipeline {

    agent none 
    stages {
        stage('Compile') {
          agent { label 'agent1' }
            steps {
                sh 'echo "run mvn clean compile"'
            }
        }

        stage('Test') {
          agent { label 'agent1' }
            steps {
                sh 'echo "run mvn test"'
            }
        }

        stage('Deploy') {
         agent { label 'agent2' }
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
            mail to: 'tawfiqakdir@gmail.com',
                 subject: "Status: ${currentBuild.fullDisplayName}",
                 body: "Build ${env.BUILD_NUMBER} finished with ${currentBuild.currentResult}. View at ${env.BUILD_URL}"
        }
    }
}
