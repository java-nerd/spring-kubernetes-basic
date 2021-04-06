# SpringBoot + Docker + JIB bare minimum app

## System Requirement

1. Maven
2. Java 8

### Package the Jar and Push to Docker Hub

1. `cd <project dir>`

2. ` mvn clean package `

### Build and Run Image

## Note: Use the <image-name> used in pom.xml while pushing to docker hub

1. Make sure docker is running i.e. `docker ps`
2. Pull image from the repo `docker pull <image-name>`
3. Run docker image `docker run -p 8080:8080 <image-name>`
3. Go to browser and type `localhost:8080`

we should see landing page of our app

![img.png](img.png)

## Congrats! you have springboot app running