pipeline {
    agent any
    stages {
        stage('pull') {
            steps {
                git 'https://github.com/shubhamkalsait/studentapp-ui.git'
            }
        }
        stage('build') {
            steps {
                echo 'build is succeed'
            }
        }
        stage('test') {
            steps {
                echo 'test is done'
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy is done'
            }
        }
    }
}