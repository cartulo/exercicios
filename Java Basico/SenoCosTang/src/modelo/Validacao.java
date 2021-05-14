package modelo;

public class Validacao extends absPropriedades
    {

    public Validacao(String numero)
        {
        super(numero);
        Executar();
        }

    public void Executar()
        {
        mensagem = "";

        try
            {
            this.numero = this.numero.replaceAll(",", ".");
            this.n1 = Double.parseDouble(this.numero);

            if (this.n1 <= 0)
                {
                mensagem = "Insira valores maiores que zero";
                }
            if (this.n1 > 360)
                {
                mensagem = "Apenas números até 360";
                }
            }

        catch (NumberFormatException e)
            {
            mensagem = "Digite apenas números";
            }
        catch (Exception e)
            {
            mensagem = "Erro.";
            }
        }
    }
