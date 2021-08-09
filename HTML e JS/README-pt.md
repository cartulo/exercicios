<html>
<body>
<div style="text-align: center">
    <h1>📝 HTML e JavaScript</h1>
    <p>Aqui eu tenho cinco exercícios separados de HTML e JavaScript.</p>
    <p style="text-align: center"><a href="https://github.com/Cartulo/Exercicios/tree/main/HTML%20e%20JS">🔎Explore a documentação »</a></p>
</div>

<h1>📝 Lista de Exercícios</h1>
<p>
<input type="checkbox" checked>
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio1-basico.html">Exercício 01</a> - Criar uma página HTML que contenha um formulário com os campos nome, pontos, nota, universidade, empresas, avatars, horários.<br>
Podem utilizar o elemento <code>input type="text"</code> do form HTML para esses campos.<br>
Além disso criem um botão <code>type="submit"</code>.
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio2-basico.html">Exercício 02</a> - Crie uma função Javascript que permita validar o formulário criado no  exercício 01 quanto a obrigatoriedade dos campos para submit do form no botão submit.
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio3-basico.html">Exercício 03</a> -  Transformar os campos “elementos“ da página criada no exercício 01, em tipos de campos apropriados para o domínio de informação neles contidos.<br>
Ex.: o campo “avatars” ao invés de utilizar um “input text” poderia utilizar um  “select” visto que ele pode conter uma lista multivariada de itens para seleção, o  famoso “combobox”.
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio4-basico.html">Exercício 04</a> - Utilizando o objeto Javascript “XMLHttpRequest” realize o POST do recurso  “usuario“ para autenticação na API REST.<br>
O objeto JSON (JavaScript Object Notation) apresentado abaixo, para o endereço: http://52.91.139.190/fsapi/users/login<br>
<pre><code>     {
         "email": "fschorles@test.com",
         "password": "123456"
     }
</code></pre>
Dica: Para submeter dados json a um servidor web devemos utilizar o <code>content type = application/json</code>
</p>

---

<p>
<input type="checkbox" checked />
<a href="https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio5-basico.html">Exercício 05</a> - Após realizar o login, considere um diferencial realizar a criação de um  usuário. <br>
A API para esse serviço está protegida por mecanismo para autenticação  baseada em token. <br>
<i>URL:</i> http://52.91.139.190/fsapi/users/auth/register-jwt <br>
<i>Método:</i> POST <br>
<i>JSON Exemplo:</i> <br>
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
Header: Token para autenticação no serviço. Pegar do retorno do login  realizado no exercício anterior <br> <br> 
Authorization = Bearer <br>
eyJhbGciOiJIUzI1NiJ9.eyJpZCI6IjVjNDYxMmM4ZGY3NWVkZmY0ZmJlNDlmZCJ9.gw8v8xd2XqhmBjG 83hw2JTncXsLg9n3bzo9sob_I5w4
</p>
</body>
</html>
