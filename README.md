# Spring Quickstart Guide

This is the source code for the basic Spring tutorial. It covers setting up
the application, creating a method to handle an HTTP request, and starting the
server.

The point of interest is the file

    src/main/java/com/example/demo/DemoApplication.java

This file contains the code that defines the application and receives the 
request, as well as an explanation of each part of the code.

To start the server, type

	$ ./mvnw spring-boot:run

To visit the webpage that the code sets up, go to

	http://localhost:8080/hello
