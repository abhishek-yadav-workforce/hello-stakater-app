# HelloStakaterApp

## Requirements

`For building and running the application you need:`

- [JDK 1.11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- [Gradle](https://plugins.gradle.org/)
- [Minkube](https://minikube.sigs.k8s.io/docs/start/)

## Project Description
    - Springboot web project with  GET:"/getName" endpoint which returns name from environment variable.
    - Application will run on port 8080.

## Build Project
Clone project locally `git clone https://github.com/abhishek-yadav-workforce/hello-stakater-app.git`
Build Project - `gradlew clean build`
To run project locally`java -jar build/libs/helloapp-0.0.1-SNAPSHOT.jar` 

## Build Docker Image
 DockerFile(Docker Script) file which is present in the project
 - Steps to create docker image and push in container registry
1. `gradlew clean build`
2. `docker build --force-rm -f Dockerfile -t {reponame}/stakater-app:{docker_version} .`
3. `docker login -u username -p password`
4. `docker tag docker.io/{reponame}/stakater-app:{docker_version} hellostakaterapp:{docker_version}`
5. `docker push docker.io/{reponame}/stakater-app:{docker_version}`
        
## Helm Chart Creation and Deployment in minikube
1. helm-repo folder is present in the root directory 
2. Chart,Values file and template folder is present
3. `helm install hellostakaterapp ./helm-repo` used to install applicatin in kubernetes cluster
4. `helm upgrade hellostakaterapp ./helm-repo` to update application version


