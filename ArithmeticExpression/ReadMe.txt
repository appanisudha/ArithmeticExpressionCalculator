Check out the project from Git link


1) Import project as Maven project
2) Go to ArithmeticExpressionApplication
3) Right click and Run as SpringBoot App
4) Open the browser
5) Open link  http://localhost:8050/calculate
6) Give the Arithmetic Expression and click on Calculate
7) The application will calculate the output display result.
8) It also saves the data into the table ARITHMETIC_CALCULATION

Validations:
1) Application throws an error when the expression is empty. It uses Javascript validations.


DB:
1) It connects to H2 in memory database and stores the data
2) data.sql is the ddl script.
3) console details for DB: http://localhost:8050/h2-console
url: jdbc:h2:mem:testdb
username: sa
password: sa


Screenshots:
Refer the screeshots under main/resources/images