### Nesta pasta iremos ver 5 exercícios básicos de HTML e um pouco de JavaScript, segue os exercícios:

**[Exercício 01](https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio1-basico.html)** – Criar uma página HTML que contenha um formulário com os campos nome,  pontos, nota, universidade, empresas, avatars, horários. 
Podem utilizar o  elemento input type text do form HTML para esses campos. 
Além disso criem um  botão type submit. 

----------------------------------------------------------------------------------------------------

**[Exercício 02](https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio2-basico.html)** – Crie uma função Javascript que permita validar o formulário criado no  exercício 01 quanto a obrigatoriedade dos campos para submit do form no botão submit. 

----------------------------------------------------------------------------------------------------

**[Exercício 03](https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio3-basico.html)** – Transformar os campos “elementos“ da página criada no exercício 01, em  tipos de campos apropriados para o domínio de informação neles contidos.  
Ex.: o campo “avatars” ao invés de utilizar um “input text” poderia utilizar um  “select” visto que ele pode conter uma lista multivalorada de itens para seleção, o  famoso “combobox”.

----------------------------------------------------------------------------------------------------

**[Exercício 04](https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio4-basico.html)** – Utilizando o objeto Javascript “XMLHttpRequest” realizar o POST do recurso  “usuario“ para autenticação na API REST. 
O objeto JSON “JavaScript Object  Notation” apresentado abaixo,  para o endereço  
http://52.91.139.190/fsapi/users/login
    { 
        "email": "fschorles@teste.com", 
        "password": "123456" 
    } 
Dica: para submeter dados json a um servidor web devemos utilizar o content type = application/json 

----------------------------------------------------------------------------------------------------

**[Exercício 05](https://github.com/Cartulo/Exercicios/blob/main/HTML%20e%20JS/exercicio5-basico.html)** – Após realizar o login considero um diferencial realizar a criação de um  usuário. 
A API para esse serviço está protegida por mecanismo para autenticação  baseada em token. 
*URL:* http://52.91.139.190/fsapi/users/auth/register-jwt
*Método:* POST 
*JSON Exemplo:*
```
{  
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
```
Header: Token para autenticação no serviço. Pegar do retorno do login  realizado no desafio anterior 
Authorization = Bearer  
eyJhbGciOiJIUzI1NiJ9.eyJpZCI6IjVjNDYxMmM4ZGY3NWVkZmY0ZmJlNDlmZCJ9.gw8v8xd2XqhmBjG 83hw2JTncXsLg9n3bzo9sob_I5w4





