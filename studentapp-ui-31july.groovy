Pipeline {
    agent any
    stages {
        stage ('Pull') {
            steps {
                git branch: 'main', url: 'https://github.com/shubhamkalsait/studentapp-ui.git'
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