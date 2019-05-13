pipeline {
  agent {
    docker {
      image 'maven:3-alpine-jdk-8-slim'
      args '-v /root/.m2:/root/.m2'
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