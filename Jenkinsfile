 pipeline {
    agent any
    stages {
        stage('1.Clone repository') {
            checkout scm
        }
        stage('2.Maven build') {
           sh "mvn clean install -e"
        }
        stage('3.Build image') {
            step {
                script {
                    sh "docker build -t spring-boot-docker:spring-docker ."
                }
            }
        }
    }
}