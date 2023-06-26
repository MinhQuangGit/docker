 pipeline {
    agent any
    stages {
        stage('1.Clone repository') {
            steps {
                git 'https://github.com/MinhQuangGit/docker.git'
            }
        }
        stage('3.Build image') {
            steps {
               script {
                 sh "docker build -t spring-boot-docker:spring-docker ."
                 }
             }
         }
    }
}