package modelo;

public class Controle
    {

    private String num1;
    private String num2;
    private String mensagem;
    private String operacao;
    private String resultado;

    public Controle(String num1, String num2, String operacao)
        {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        this.executar();
        }

    private void executar()
        {

        mensagem = "";
        Validacao validacao = new Validacao(this.num1, this.num2, this.operacao);
        if (validacao.getMensagem().equals(""))
            {
            Calcular calcular = new Calcular(validacao.getNumero1(), validacao.getNumero2(), this.operacao);
            this.resultado = calcular.getResultado();

            }
        else
            {
            this.mensagem = validacao.getMensagem();
            }

        }

    public String getMensagem()
        {
        return mensagem;
        }

    public String getResultado()
        {
        return resultado;
        }
    }
