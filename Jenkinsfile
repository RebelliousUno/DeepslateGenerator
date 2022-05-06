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
                    sh './gradlew clean'
                }
            }
        }
        stage('build') {
            steps {
                echo 'building'
                withGradle {
                    sh './gradlew.bat build'
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
