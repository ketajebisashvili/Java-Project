<h1>ICS0014-2022 Java Technologies</h1>
<h2>team_04</h2>
<h2>Project 2. Version 2.</h2>

<h3>
Members: <br>
Ketevan Jebisashvili <br>
Benedek Matveev
</h3>

This is an updated second version of our previous code:
https://gitlab.cs.ttu.ee/bematv/java-project2

This version contains a third calculator API and only developed by <b>Benedek Matveev</b>.
This version code can be found at:
https://gitlab.cs.ttu.ee/bematv/ics0014-2022-java-project-2-version-2

The new calculator API can do the following functions:

* <b> MaxOdd: </b><br>
    The API selects the highet odd number from the input.
* <b> Sum: </b><br>
    The API adds together the input numbers, summarize them.
* <b> Even: </b><br>
    The API selects the even numbers from the input.

<h2>Run and test the Application:</h2>

Start Application in CalculatorApplication.java  
Application runs at: http://localhost:8080  
Swagger UI is accessible: http://localhost:8080/swagger-ui/index.html

<b>Testing with Postman software:</b><br>
You have to put the following command to the GET input box:
http://localhost:8080/calculator/calculate1?numbers=1,2,3
http://localhost:8080/calculator/calculate2?numbers=1,2,3
http://localhost:8080/calculator/calculate3?numbers=1,2,3

<b>Testing with browser software:</b><br>
You have to put the following command to the browser's url line:
http://localhost:8080/calculator/calculate1?numbers=1,2,3
http://localhost:8080/calculator/calculate2?numbers=1,2,3
http://localhost:8080/calculator/calculate3?numbers=1,2,3

<b>You can change the integers after the " numbers= " part of the url, the calculator API should give the correct output based on your input numbers. </b>