pipeline {
    agent any
	stages {
	    stage('Clone') {
            steps {
                git 'https://github.com/MinhQuangGit/docker.git'
            }
        }
  	    stage('Maven Install') {
  	        tools {
  	            maven 'Maven 3.5.0'
  	            jdk 'jdk17'
  	        }
            steps {
      	        sh 'mvn clean install'
            }
        }
        stage('Docker Build') {
            steps {
      	        sh 'docker build -t minhquang35/spring-docker:latest .'
            }
        }
        stage('Docker Push') {
    	agent any
            steps {
      	        withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
                    sh 'docker push minhquang35/spring-docker'
                }
            }
        }
    }
}