node {
  /*ecrRegistry = "508824606728.dkr.ecr.eu-central-1.amazonaws.com/test1-httpd:latest"
  git '/tmp/repo'
  checkout scm*/

  stage('Build Docker Image') {    
        sh 'aws ecr get-login --no-include-email --region eu-central-1'
        sh 'docker build -t test1-httpd .'
       
    }

  stage('Push Docker Image to ECR') {
      sh 'docker tag test1-httpd:latest 508824606728.dkr.ecr.eu-central-1.amazonaws.com/test1-httpd:latest'
      sh 'docker push 508824606728.dkr.ecr.eu-central-1.amazonaws.com/test1-httpd:latest'

      /*docker.withRegistry("https://your.ecr.domain.amazonws.com", "ecr:us-east-1:credential-id") {
  sh 'docker.image("your-image-name").push()'*/
}
    }

  stage('Deploy Task Deffinition') {


    } 

  stage('Notification') {
        /*docker build -t ga-notification -f devops/docker/ga-server/Dockerfile
        docker tag ga-notification 508824606728.dkr.ecr.eu-central-1.amazonaws.com/ga-notification:latest
        docker push 508824606728.dkr.ecr.eu-central-1.amazonaws.com/ga-notification:latest*/
    }

  
}

