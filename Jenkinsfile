pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
    }

  }
  stages {
    stage('initialize/Print msg') {
      steps {
        sh 'mvn clean build'
      }
    }
  }
}