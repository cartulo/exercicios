        function validaForm() {
            nome = document.getElementById("nome").value;
            empr = document.getElementById("empresas").value;
            hora = document.getElementById("horas").value;
            if (nome == "" || empr == "" || hora == "") {
                alert("Todos campos devem ser preenchidos!");
                return false;
            
