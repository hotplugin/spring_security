pipeline {
  agent {
    docker {
      image 'maven:3.6.1-jdk-8'
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