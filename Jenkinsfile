pipeline {
    agent any
		stages {
        stage('Build') {
            steps{
                bat 'gradle build --info'
                }
           }
           stage('Run'){
               steps{
                bat 'java -jar "build/libs/Employees.jar"'
            } 
           }
    }
}