        function validaForm() {
            nome = document.getElementById("nome").value;
            pontos = document.getElementById("pontos").value;
            nota = document.getElementById("nota").value;
            univ = document.getElementById("universidade").value;
            empr = document.getElementById("empresas").value;
            avat = document.getElementById("avatars").value;
            hora = document.getElementById("horas").value;
            if (nome == "" || pontos == "" || nota == "" || univ == "" || empr == "" || avat == "" || hora == "") {
                alert("Todos campos devem ser preenchidos!");
                return false;
            }
        }
