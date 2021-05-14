package modelo;

public class Controle extends absPropriedades

    {

    public Controle(String numero)
        {
        super(numero);
        Executar();
        }

    @Override
    public void Executar()
        {
        mensagem = "";
        Validacao validacao = new Validacao(this.numero);
        if (validacao.mensagem.equals(""))
            {
            Calcular calcular = new Calcular(validacao.n1);
            resposta = calcular.resposta;
            }
        else
            {
            mensagem = validacao.mensagem;
            }
        }
    }
