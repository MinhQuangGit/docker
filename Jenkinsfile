 pipeline {
    agent none stages {
    stage("Maven Install") {
        agent {
        docker {
            image 'maven:3.5.0'
        }
      }
      steps {
        sh 'mvn clean install'
      }
    }
    stage('Docker Build') {
        agent any
       steps {
        sh 'docker build -t minhquang35/spring-boot-docker:spring-docker .'
       }
    }
    stage('Docker Push') {
        agent any
       steps {
          withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
              sh 'docker push minhquang35/spring-boot-docker'
       }
    }
   }
}