package modelo;

public class Controle extends absPropriedades
    {

    public Controle(String lado1, String lado2, String lado3)
        {
        super(lado1, lado2, lado3);
        this.executar();
        }

    private void executar()
        {
        this.setMensagem("");
        Validacao validacao = new Validacao(this.getLado1(), this.getLado2(), this.getLado3());
        if (validacao.getMensagem().equals(""))
            {
            Triangulos triangulos = new Triangulos(validacao.getL1(), validacao.getL2(), validacao.getL3());
            this.setMensagem(triangulos.getMensagem());
            }
        else
            {
            this.setMensagem(validacao.getMensagem());
            }
        }
    }
