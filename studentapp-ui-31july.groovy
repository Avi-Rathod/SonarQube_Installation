Pipeline {
    agent any
    stages {
        stage ('Pull') {
            steps {
                git 'https://github.com/smitkotkar/jenkins_practice.git'
            }
        }
        stage ('Build') {
            steps {
                echo 'build is succeed'
            }
        }
        stage ('Test') {
            steps {
                echo 'Test is done'
            }
        }
        stage ('Deploy') {
            steps {
                echo 'Deployment is done'
            }
        }
    }
}