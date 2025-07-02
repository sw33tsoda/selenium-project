pipeline {
    agent any

    tools {
        jdk 'JDK 24'           // Ensure JDK 24 is installed and named like this in Jenkins > Global Tools
        maven 'Maven 3.9.0'    // Same for Maven
    }

    environment {
        DISPLAY = ':99' // Needed for browsers on Linux, ignored if not needed
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }
    }
}
