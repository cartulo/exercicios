package modelo;

public abstract class absPropriedades
    {

    private String lado1;
    private String lado2;
    private String lado3;
    private Double l1;
    private Double l2;
    private Double l3;
    private String mensagem;
    private String resposta;

    public absPropriedades(String lado1, String lado2, String lado3)
        {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        }

    public absPropriedades(Double l1, Double l2, Double l3)
        {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
        }

    public String getMensagem()
        {
        return mensagem;
        }

    public void setMensagem(String mensagem)
        {
        this.mensagem = mensagem;
        }

    public String getLado1()
        {
        return lado1;
        }

    public void setLado1(String lado1)
        {
        this.lado1 = lado1;
        }

    public String getLado2()
        {
        return lado2;
        }

    public void setLado2(String lado2)
        {
        this.lado2 = lado2;
        }

    public String getLado3()
        {
        return lado3;
        }

    public void setLado3(String lado3)
        {
        this.lado3 = lado3;
        }

    public Double getL1()
        {
        return l1;
        }

    public void setL1(Double l1)
        {
        this.l1 = l1;
        }

    public Double getL2()
        {
        return l2;
        }

    public void setL2(Double l2)
        {
        this.l2 = l2;
        }

    public Double getL3()
        {
        return l3;
        }

    public void setL3(Double l3)
        {
        this.l3 = l3;
        }

    public String getResposta()
        {
        return resposta;
        }

    public void setResposta(String resposta)
        {
        this.resposta = resposta;
        }
    }
