pipeline {
  agent {
    docker {
      image 'maven:3-alpine-jdk-8-slim'
    }

  }
  stages {
    stage('initialize docker maven') {
      steps {
        sh 'mvn clean build'
      }
    }
  }
}