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
               withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
                    sh 'docker build -t minhquang35/docker-hub-rep .'
                    sh 'docker push minhquang35/docker-hub-rep'
               }
             }
         }
    }
}