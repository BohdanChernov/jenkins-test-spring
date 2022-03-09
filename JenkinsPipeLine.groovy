pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
            }
        }
        stage('Build') {
            steps {
                echo 'Hello World Build'
            }
        }
        stage('Test') {
            steps {
                echo 'Hello World Test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Hello World Deploy'
            }
        }
        stage('Download') {
             steps {
                 echo 'Hello World Download'
                 modules.first = load "DownloadFilesFromDataBase.groovy"



                 echo 'Hello World Download Finish'

//                 modules.second = load "second.groovy"
//                 modules.second.init(modules.first)
//                 modules.first.test1()
//                 modules.second.test2()
             }
        }
    }
}