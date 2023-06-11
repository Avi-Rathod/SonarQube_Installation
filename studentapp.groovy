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
                sh '/opt/apache-maven/bin/mvn clean package'
            }
        }
        stage ('test') {
            steps {
                sh '/opt/apache-maven/bin/mvn sonar:sonar -Dsonar.projectKey=studentapp -Dsonar.host.url=http://3.21.106.59:9000 -Dsonar.4ca9753beca7cd15cc83194ec1e4f71c039cf661'
            }
        }
        stage ('deploy') {
            steps {
                echo 'deploy is succeed'
            }
        }
    }
}   