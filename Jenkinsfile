pipeline {
    agent any
    tools {
        maven 'maven_3_5_0'
        jdk 'JDK 17'
    }
	stages {
	    stage('Clone') {
            steps {
                git 'https://github.com/MinhQuangGit/docker.git'
            }
        }
  	    stage('Maven Install') {
            steps {
                sh 'java --version'
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