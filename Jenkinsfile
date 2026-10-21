pipeline {
    agent any

    tools {
        jdk 'JDK21'
        maven 'Maven3'
    }

    stages {
        stage('Verify Tools') {
            steps {
                bat 'java -version'
                bat 'mvn -version'
            }
        }

        stage('Run Cucumber Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true,
                  testResults: 'target/surefire-reports/TEST-*.xml'
                  publishHTML(target: [
    reportDir: 'target',
    reportFiles: 'cucumber-report.html',
    reportName: 'Cucumber HTML Report',
    keepAll: true,
    alwaysLinkToLastBuild: true,
    allowMissing: false
])
        }
    }
}