pipeline {
    agent any

    stages {
        stage('Clone the Repo') {
            steps {
                git url: "https://github.com/TechTitans-Academy/TechTitans-Restaurant-App.git", branch: "main"
            }
        }
        stage('Compile Code!'){
            steps {
                sh "./mvnw compile"
            }
        }
        stage('Package Application'){
            steps {
                sh "./mvnw clean package -DskipTests"
            }
        }
        stage('Build Dockerfile'){
            steps {
                sh "/usr/local/bin/docker build . -t dinnerapp"
            }
        }
        stage('Run Application'){
            steps{
                sh "/usr/local/bin/docker run -p 8083:8080 -d dinnerapp"
            }
        }
    }
}
