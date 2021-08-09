<html>
<body>
<div style="text-align: center">
    <h1>📝 HTML and JavaScript</h1>
    <p>Here I have five separate HTML and JavaScript exercises. </p>
    <p style="text-align: center"><a href="https://github.com/Cartulo/Exercicios/tree/main/HTML%20e%20JS">🔎Explore the docs »</a></p>
</div>

<h1>📝 Exercise List</h1> 
<p>
<input type="checkbox" checked>
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio1-basico.html">Exercise 01</a> - Create an HTML page that contains a form with the fields: name, points, grade, university, companies, avatars, times. You can use the HTML form input type text element for these fields. Also create a type submit button.<br>
You can use the <code>input type="text"</code> element of the HTML form for these fields.<br>
Also create a <code>type="submit"</code> button. 
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio2-basico.html">Exercise 02</a> - Create a Javascript function that allows you to validate the form created in exercise 01 regarding the obligatory nature of the form submit fields in the submit button. 
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio3-basico.html">Exercise 03</a> - Transform the elements fields of the page created in exercise 01 into appropriate field types for the domain of information contained therein.<br>
Example: the "avatars" field instead of using an "input text" could use a "select" since it can contain a multivalued list of items for selection, the famous "combobox".
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio4-basico.html">Exercise 04</a> - Using the Javascript object "XMLHttpRequest" perform the POST of the resource "user" for authentication in the REST API.<br>
The JSON (JavaScript Object Notation) object shown below, for the address
http://52.91.139.190/fsapi/users/login<br>
<pre><code>     {
         "email": "fschorles@test.com",
         "password": "123456"
     }
</code></pre>
<br>
Tip: to submit json data to a web server we must use the <code>content type = application/json</code> 
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio5-basico.html">Exercise 05</a> - After logging in, I consider it a differential to create a user.
The API for this service is protected by a token-based authentication mechanism. <br> <br>
<i>URL:</i> http://52.91.139.190/fsapi/users/auth/register-jwt <br>
<i>Method:</i> POST <br>
<i>JSON Example:</i>
<pre><code>{  
    "login": "fschorles@gmail.com", 
    "name": "Felipe Schorles", 
    "email":"fschorles@gmail.com", 
    "password": "123456", 
    "confirma_password": "123456", 
    "idEmpresa": "13", 
  "Status": "Aprovado", 
   "role" : "Client", 
   "regId": "", 
    "status" : "Aprovado" 
} 
</code></pre>
Header: Token for authentication to the service. Get from the return of the login performed in the previous exercise <br> <br>
Authorization = Bearer <br>
eyJhbGciOiJIUzI1NiJ9.eyJpZCI6IjVjNDYxMmM4ZGY3NWVkZmY0ZmJlNDlmZCJ9.gw8v8xd2XqhmBjG 83hw2JTncXsLg9n3bzo9sob
</p>
</body>
</html>
