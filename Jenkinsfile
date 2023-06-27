 pipeline {
    agent {
        docker {image 'spring-docker:docker-test'}
    }
    stages {
        stage('1.Clone repository') {
            steps {
                git 'https://github.com/MinhQuangGit/docker.git'
            }
        }
//         stage('3.Build image') {
//             steps {
//                withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
//                  sh 'docker build -t minhquang35/spring-boot-docker .'
//                  sh 'docker push minhquang35/spring-boot-docker'
//                }
//              }
//          }
    }
}