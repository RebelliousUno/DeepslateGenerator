pipeline {
    agent any
    triggers {
        pollSCM 'H * * * *'
    }
    tools {
        jdk 'JDK 16'
    }
    stages {
        stage('clean') {
            steps {
                echo 'cleaning'
                withGradle {
                    bat 'gradlew.bat clean'
                }
            }
        }
        stage('build') {
            steps {
                echo 'building'
                withGradle {
                    bat 'gradlew.bat build'
                }
            }
        }       
    }
    post {
        always{
            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
        }
    }
}
