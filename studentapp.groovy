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
                sh '/opt/apache-maven/bin/mvn clean package'
            }
        }
        // stage('test') {
        //     steps {
        //         sh '/opt/apache-maven/bin/mvn sonar:sonar -Dsonar.projectKey=studentapp -Dsonar.host.url=http://18.222.206.143:9000  -Dsonar.login=dc087b4b903d9453581131fcb788e16f380def34'
        //     }
        // }
        stage('build-test') {
            steps {
                 withSonarQubeEnv(installationName:'sonar-server',credentialsId: 'sonar_token') { 
                   sh '/opt/apache-maven/bin/mvn sonar:sonar -Dsonar.ProjectKey=studentapp'
               }
            }
        }
        stage('quality-gate') {
            steps {
                timeout (time:10, unit:'MINUTES') {
                    waitforQualityGate abortPipeline:true
                }
            }
        }
        stage('deploy') {
            steps {
                echo 'deploy is success'
            }
        }
    }
}