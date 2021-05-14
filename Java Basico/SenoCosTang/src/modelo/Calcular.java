package modelo;

import java.text.DecimalFormat;

public class Calcular extends absPropriedades
    {

    public Calcular(Double n1)
        {
        super(n1);
        Executar();
        }

    @Override
    public void Executar()
        {
        DecimalFormat df = new DecimalFormat("0.00");

        Double rad = (Math.PI / 180) * this.n1;

        Double seno = Math.sin(rad);
        Double cosseno = Math.cos(rad);
        Double tangente = Math.tan(rad);

        resposta = "<html> Seno vale = " + df.format(seno)
                + "<br> Cosseno vale = " + df.format(cosseno)
                + "<br> Tangete é: " + df.format(tangente) + "</html>";
        }
    }
