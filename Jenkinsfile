 pipeline {
    agent any
    stages {
        stage('Clone stage') {
            steps {
                git 'https://github.com/MinhQuangGit/docker.git'
            }
        }
        stage('Build stage') {
            steps {
                withDockerRegistry(credentialsId: 'docker-hub', url: 'https://hub.docker.com/') {
                    sh 'docker build -t docker-jenkins/docker-hub-rep:v1 .'
                    sh 'docker push docker-jenkins/docker-hub-rep:v1 .'
                }
            }
        }
    }
}