package modelo;

public class Validacao
    {

    private String num1;
    private String num2;
    private Double numero1;
    private Double numero2;
    private String mensagem;
    private String operacao;

    public Validacao(String num1, String num2, String operacao)
        {
        this.num1 = num1.replaceAll(",", ".");
        this.num2 = num2.replaceAll(",", ".");
        this.operacao = operacao;
        this.validar();
        }

    private void validar()
        {
        mensagem = "";
        try
            {
            numero1 = Double.parseDouble(num1);
            numero2 = Double.parseDouble(num2);
            if (operacao.equals("/"))
                {
                if (numero1.equals(0.0) || numero2.equals(0.0))
                    {
                    mensagem = "Impossivel Dividir por zero";
                    }
                }
            }
        catch (Exception e)
            {
            if (num1.equals("") && num2.equals(""))
                {
                mensagem = "Preencha os dois campos vazios";
                }
            else if (num1.equals(""))
                {
                mensagem = "Preencha o primeiro campo";
                }
            else if (num2.equals(""))
                {
                mensagem = "Preencha o segundo campo";
                }
            else
                {
                mensagem = "Erro na conversão dos campos";
                }
            }
        }

    public String getMensagem()
        {
        return mensagem;
        }

    public Double getNumero1()
        {
        return numero1;
        }

    public Double getNumero2()
        {
        return numero2;
        }
    
    }
