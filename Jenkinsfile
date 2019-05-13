pipeline {
  agent any
  stages {
    stage('BuildService') {
      steps {
        sh 'mvn clean build'
      }
    }
  }
}