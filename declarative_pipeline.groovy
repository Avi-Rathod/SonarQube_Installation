Pipeline {
    agent any
    stages {
        stage ('pull') {
            steps {
                echo 'Pull Succeed'
          }
        }
        stage ('build') {
            steps {
                echo 'Congrates! build is done'
            }
        }
        stage ('test') {
            steps {
                echo 'test succeed'
            }
        }
        stage ('deploy') {
            steps {
                echo 'deploy succeed'
            }
        }
    }
}