Rest service Hello World with RestEasy

Tools and Technologies used :

Java 1.8, ReastEasy, Tomcat 8.5, Maven , Sts

Step 1
Create a new Maven project with name “RestEasyHelloWold” in STS.


Step 2
Add the RestEasy server dependency to pom.xml


Step 3
Update web.xml file with RestEasy servlet container

Step 4
Create a Hello world Rest service

Step 5
Build the project and deploy the project in the Tomcat server

Step 6
Start the server

Step 7
Access the Rest service using below URL : 
http://localhost:8080/RestEasyHelloWorld/rest/hello



##########
  ===> Alternative way of Implementing Rest service using RestEasy <===
  
We can also achieve Rest service implementation by defining our application class by extending javax.ws.rs.core.Application.

In this case, we don’t need to provide resteasy.scan to scan the Rest services rather we just need to make an entry of our Application class in the web.xml

##########


For more detaild please refetr to the link above : 

http://javainsimpleway.com/rest-service-hello-world-with-resteasy/
