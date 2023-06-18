pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
                git 'https://github.com/shubhamkalsait/studentapp-ui.git'
            }
        }
        // stage ('build') {
        //     steps {
        //         echo 'build is succeed'
        //     }
        // }
        stage ('build') {
            steps {
                sh '/opt/apache-maven/bin/mvn clean package'
            }
        }
        stage ('test') {
            steps {
                echo 'test is succeed'
            }
        }
        // stage ('test') {
        //     steps {
        //         sh '/opt/apache-maven/bin/mvn sonar:sonar -Dsonar.projectKey=student-app -Dsonar.host.url=http://18.191.140.71:9000 -Dsonar.login=14452028edda616eb19f53e0592232f70f8eacd2'
        //     }
        // }
        // stage ('build-test') {
        //     steps {
        //         withSonarQubeEnv(installationName:'sonar-server',credentialsId: 'sonar-token') { 
        //           sh '/opt/apache-maven/bin/mvn sonar:sonar -Dsonar.ProjectKey=student-app'
        //         }  
        //     }
        // }
        stage ('deploy') {
            steps {
                echo 'deploy is succeed'
            }
        }
    }
}   