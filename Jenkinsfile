pipeline {
  agent {
    docker {
      args '-v /root/.m2:/root/.m2'
      image 'maven:3-alpine'
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