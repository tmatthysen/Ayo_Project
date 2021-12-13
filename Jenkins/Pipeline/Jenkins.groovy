pipeline {
    agent any
    
    tools{
        maven 'MAVEN_HOME' 
    }
    stages {
        stage('Checkcout Code'){
            steps {
                git(url: 'https://github.com/tmatthysen/project_java.git', branch: 'main')
            }
        }
        stage('Build') {
            steps {
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }

        }
        stage('Deploy') {
            steps {
                sh "docker-compose build maven_app"
                sh "docker rm -f mavenApp || true"
                sh "docker-compose up -d"
            }
        }
    }
}
