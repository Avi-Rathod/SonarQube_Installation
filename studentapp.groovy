pipeline {
    agent any
    stages {
        stage('pull') {
            step {
                git 'https://github.com/shubhamkalsait/studentapp-ui.git'
            }
        }
        stage('build') {
            step {
                echo 'build is succeed'
            }
        }
        stage('test') {
            step {
                echo 'test is done'
            }
        }
        stage('deploy') {
            step (
                echo 'deploy is done'
            )
        }
    }
}