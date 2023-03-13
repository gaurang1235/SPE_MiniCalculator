pipeline {
	agent any
	environment{
	    PATH = "/opt/homebrew/bin:/usr/local/bin/docker:$PATH"
	}

    stages {
        stage('Git Pull') {
            steps {
				git url: 'https://github.com/gaurang1235/SPE_MiniCalculator.git',
				branch: 'main'
            }
        }
        stage('Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Images') {
            steps {
                sh 'docker build -t iiitbgaurang/spe_project:latest'
            }
        }
//         stage('Publish Docker Images') {
//             steps {
//                 withDockerRegistry([ credentialsId: "iiitbgaurang", url: "" ]) {
//                     sh 'docker push iiitbgaurang/SPE_MiniCalculator:latest'
//                 }
//             }
//         }
//         stage('Clean Docker Images') {
//             steps {
//                 sh 'docker rmi -f iiitbgaurang/SPE_MiniCalculator:latest'
//             }
//         }
//         stage('Deploy and Run Image'){
//             steps {
//                 ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'playbook.yml', sudoUser: null
//             }
//         }

    }
}