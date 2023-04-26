pipeline{

agent any

stages{

stage('Checkout'){

steps{

git branch: "main", url: 'https://github.com/kczodape/demo.git'

}

}

stage('Build'){

steps{

sh 'chmod a+x mvnw'

sh './mvnw clean install -DskipTests=true'

}

post{

always{

archiveArtifacts 'target/*.jar'

}

}

}

stage('DockerBuild') {

steps {

sh 'docker build -t zodape2001/demo-svc-repo:latest .'

}

}

stage('Login') {

steps {

sh 'echo Pass@7872 | docker login -u zodape2001 --password-stdin'

}

}

stage('Push') {

steps {

sh 'docker push zodape2001/g3-allergy-service'

}

}

}

post {

always {

sh 'docker logout'

}

}

}