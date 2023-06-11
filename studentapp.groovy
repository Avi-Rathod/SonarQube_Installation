pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
                git 'https://github.com/shubhamkalsait/studentapp-ui.git'
            }
        }
        stage ('build') {
            steps {
                echo 'Congrates! build is done'
            }
        }
        stage ('test') {
            steps {
                echo 'test is succeed'
            }
        }
        stage ('deploy') {
            steps {
                echo 'deploy is succeed'
            }
        }
    }
}   