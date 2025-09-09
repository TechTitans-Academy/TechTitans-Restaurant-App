pipeline {
    agent any
    stages {
        stage('Cloning the Repo') {
            steps {
            git branch: 'main', url: 'https://github.com/TechTitans-Academy/TechTitans-Restaurant-App.git'
            }
        }
        stage('Compiling the Code'){
            steps {
                sh "./mvnw compile"
            }
        }
        stage('Packaging Application'){
            steps {
                sh "./mvnw clean package -DskipTests"
            }
        }
        stage('Docker Image Build'){
            steps {
                sh "/usr/local/bin/docker build -t dinner-app ."
            }
        }
        stage('Starting Application'){
            steps {
                sh "/usr/local/bin/docker run -p 8083:8080 -d dinner-app"
                echo "Application is running on http://localhost:8083/menu on your browser!"
            }
        }
    }
        post { 
        always { 
            cleanWs()
        }
    }
}
