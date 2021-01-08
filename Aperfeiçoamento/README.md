### Nesta pasta iremos resolver alguns exercícios para aperfeiçoamento após os exercícios básicos de HTML e JS
Caso não tenha visto sobre esses exercícios você pode conferir clicando [AQUI](https://github.com/Cartulo/Exercicios/blob/main/HTML%2C%20CSS%20e%20JS/README.md)

---

**[Exercício 01](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio1.html)** - Crie dois botões no HTML chamados: 'Verde' e 'Vermelho'. \
Ao clicar neles o fundo da tela deve ser respectivo à cor do botão clicado. \
Ex: Clicar no botão 'Verde' deve deixar o fundo da cor verde.

---

**[Exercício 02](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio2.html)** - Crie uma função que recebe 2 parâmetros e retorna a soma deles.

---

**[Exercício 03](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio3.html)** -  Seguindo o que foi feito no exercicio 01, crie uma função que recebe 2 parâmetros e retorna a soma deles, porém caso seja passado um parâmetro vazio ela retorne zero.

---

**[Exercício 04](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio4.html)** - Crie uma função que recebe o ano de nascimento da pessoa informando se ela é maior de idade ou menor.

---

**[Exercício 05](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio5.html)** - Crie uma função que informa se tem os caracteres 'dota' no parâmetro informado, exiba um alert em tela caso seja verdadeiro. \
\
Ex: 'lol é melhor que dota' (Afirmação que seria verdadeira) \
Ex: 'lol é melhor que Dark Souls' (Algo que é obviamente falso)

---

**[Exercício 06](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio6.html)** - Peça ao usuário para digitar 5 números em uma caixa de texto. Calcule a média das destes números digitadas pelo usuário e exiba em uma div.

---

**[Exercício 07](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio7.html)** - Crie o seguinte array: var deuses = ['Odin', 'Loki', 'Thor'] \
E Exiba a quantidade/comprimento que ele tem com a função .length

---

**[Exercício 08](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio8.html)** - Com o que foi feito no exercício anterior, exiba todos os nomes, dentro do html: ``<ul id="nomes"></ul>`` 

Exemplo:
#### **Deuses Nórdicos** 
Odin \
Loki \
Thor

---

**[Exercício 09](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio9.html)** -  Seguindo do exercício 02, adicione o .sort para filtrar o array exibido no HTML alfabeticamente.

---

**[Exercício 10](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio10.html)** - Exiba a quantidade de letras que possuem o texto inserido ao clicar no botão.

Exemplos de entrada e saída: \
'Caio' // 4 \
'Felipe' // 6 \
'Roberto' // 7 \
'Tiago' // 5

---

**[Exercício 11](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio11.html)** - Dentro da div com o id 'resultado', escreva 1x ('Repetição'). \
Dica: ``'innerHTML', el.innerHTML = 'Repetição';`` 

[11.1](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio11.1.html) - Dentro da div com o id 'resultado', escreva 2x ('Repetição'). \
[11.2](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio11.2.html) - Dentro da div com o id 'resultado', escreva 20x ('Repetição'). (use o 'for') \
[11.3](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio11.3.html) - Dentro da div com o id 'resultado', escreva 5x ('Repetição'). (agora com forEach) \
[11.4](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio11.4.html) - Dentro da div com o id 'resultado', escreva 5x ('Repetição'). (agora com while)

---

**[Exercício 12](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio12.html)** - Dentro da div com o id 'resultado', escreva os números de 0 ~ 10 (escolha uma das opções utilizado no exercício anterior)

---

**[Exercício 13](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio13.html)** - Dentro da div com o id 'resultado', escreva os números pares até 20... (ex 2,4,6...20)

---
**Exercício 14** - A partir do seguinte vetor e utilizando os métodos de array (map, reduce, filter e find):
```
const usuarios = [
 { nome: 'Caio', idade: 25, empresa: 'Google' },
 { nome: 'Tiago', idade: 35, empresa: 'Microsoft' },
 { nome: 'Felipe', idade: 30, empresa: 'Apple' },
];
```
**[14.1](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio14.1.html)** Utilizando o **[map](https://www.w3schools.com/jsref/jsref_map.asp)** \
Crie uma variável que contenha todas idades dos usuários: [23, 15, 30] \
**[14.2](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio14.2.html)** Utilizando o **[filter](https://www.w3schools.com/jsref/jsref_filter.asp)** \
Crie uma variáveis que tenha apenas os usuários que trabalham na Apple e com mais de 30 anos: ``[{ nome: 'Felipe', idade: 30, empresa: 'Apple' }}]`` \
**[14.3](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio14.3.html)** Utilizando o **[find](https://www.w3schools.com/JSREF/jsref_find.asp)** \
Crie uma variável que procura por um usuário que trabalhe na empresa Google: ``undefined``

---
**[Exercício 15/Projeto 01](https://github.com/Cartulo/Exercicios/blob/main/Aperfeiçoamento/exercicio15.html)** - 
Faça uma tela que contenha os seguintes campos: \
![](https://github.com/Cartulo/Exercicios/blob/main/img/projeto1.png) \
O SELECT deve ser preenchida com as opções que há na API informada, ao clicar no SUBMIT a API será chamada e o response dela será mostrado na tela como no exemplo acima. O valor que deve ser utilizado do responde é ‘high’. Como no exemplo de response abaixo:
```
USD: {
code: "USD",
codein: "BRL",
name: "Dólar Comercial",
high: "3,8906",
low: "3,8596",
varBid: "-0,0138",
pctChange: "-0,36",
bid: "3,8660",
ask: "3,8680",
timestamp: "1555360069",
create_date: "2019-04-15 17:27:50"
},
```
API a ser ultizada: https://docs.awesomeapi.com.br/api-de-moedas

Dica: verifique o método que requisição POST ou GET na documentação da API.

