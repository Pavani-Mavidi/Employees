pipeline {
    agent any
     parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
        string(name: "SHA1", description: 'SHA Hash')
       choice(name: 'CHOICES', choices: 'one\ntwo\nthree', description: '')
    }
		stages {
		stage('Say Hi') {
            steps {
                echo "${params.Greeting} World!"
            }
        }
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