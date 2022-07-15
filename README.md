# Taxi-service
- This is simple service where you can:
    - create drivers
    - create car manufacturers
    - create cars
    - add drivers to car
    - display all cars, manufacturers or drivers
    - display driver's current cars

## Description:
This application uses 3-layer architecture model. Those layers are: controller, service and DAO. Also, taxi-service uses
relational database for storing information about manufacturers, drivers, cars and their relations.
When you open app at first you see login page. You can log in there or register.
After passing registration you will see main menu. There you can choose any operation. 
Also, there are buttons in the top left corner, where you can see your current cars, back to main menu or log out.

## This project deployed on Heroku:
[Taxi-service](https://pure-depths-95547.herokuapp.com/login)

## Technologies used in project:
* Java 11
* Servlet API 4.0.1
* MySql 8.0.29
* Tomcat 9.0.64
* Maven
* JDBC
* JSP, JSTL
* CSS

## How to run the project:
* clone this project
* create MySql data base
* copy text from [init_db.sql](src/main/resources/init_db.sql), past and run it in your DBMS program
* change URL, username, password in [ConnectionUtil class](src/main/java/taxi/util/ConnectionUtil.java) to actual from your DB
* add Tomcat configuration
* run Tomcat

