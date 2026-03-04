# Landon Hotel Scheduling Application

Modified Spring Boot and Angular application implementing localization, multithreading, time zone conversion, and Docker containerization.

## Overview

This project enhances the existing Landon Hotel scheduling system to support internationalization requirements for a Canadian-based company and prepares the application for containerized deployment.

The application consists of:
* Spring Boot (Java backend)
* Angular (frontend)
* Docker (containerization)

## Features Implemented
### Localization (English & French)
* Created ResourceBundle files for English and French
* Implemented localized welcome messages
* Used separate threads to load and display messages concurrently
* Utilized Locale, ResourceBundle, and Java threading

### Multi-Currency Display (Frontend)
Reservation prices are displayed in:
* USD* ($)
* CAD* (C$)
* EUR* (€)

*Prices are formatted and displayed on separate lines (no conversion required).

### Time Zone Conversion
Implemented a Java time conversion method using:
* ZonedDateTime
* ZoneId
* DateTimeFormatter

The application displays a live presentation time in:
* Eastern Time (ET)
* Mountain Time (MT)
* Coordinated Universal Time (UTC)

### Docker Containerization

A Dockerfile was created to build a single image containing:
* Spring Boot backend
* Angular frontend
* All project modifications

### Build Image
`` docker build -t landon-hotel-app .``
### Run Container
`` docker run -p 8080:80 --name <containername> landon-hotel-app ``

The application runs successfully inside a Docker container.

### Deployment Strategy

The application can be deployed to a cloud provider such as AWS using:
* Elastic Beanstalk
* ECS (Fargate)
* EC2 with Docker

Recommended workflow:
* Build Docker image
* Push to container registry (Docker Hub or AWS ECR)
* Deploy containerized application
* Configure networking and SSL

### Tech Stack
Backend
* Java
* Spring Boot
* Java Time API
* ResourceBundle
* Multithreading

Frontend
* Angular
* TypeScript
* HTML / CSS

DevOps
* Docker
