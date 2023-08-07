pipeline {
    agent any
     tools {
            maven 'MAVEN_HOME'
            jdk 'JAVA_HOME'
            'org.jenkinsci.plugins.docker.commons.tools.DockerTool' 'docker'
     }
	stages {
	    stage('Clone') {
            steps {
                git branch: 'master', url: 'https://github.com/MinhQuangGit/docker.git'
            }
        }
  	    stage('Maven Install') {
             steps {
             	 sh 'mvn clean install -Dmaven.test.skip=true'
             }
        }
        stage('Docker Build') {
            steps {
                sh 'docker --version'
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