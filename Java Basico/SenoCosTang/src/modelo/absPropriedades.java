package modelo;

public abstract class absPropriedades implements intMetodos
    {

    public String mensagem;
    protected String numero;
    protected Double n1;
    protected Double seno;
    protected Double cosseno;
    protected Double tangente;
    protected String resposta;

    public absPropriedades(String numero)
        {
        this.numero = numero;
        Executar();
        }

    public absPropriedades(Double n1)
        {
        this.n1 = n1;
        Executar();
        }

    @Override
    public String toString()
        {
        return resposta;
        }

    @Override
    public void Executar()
        {
        // Não sei oque coloco aqui, mas o código funciona =D
        }

    }
