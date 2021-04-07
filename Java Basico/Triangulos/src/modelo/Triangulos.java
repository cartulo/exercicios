package modelo;

public class Triangulos extends absPropriedades
    {

    public Triangulos(Double l1, Double l2, Double l3)
        {
        super(l1, l2, l3);
        this.Verificar();
        }

    private void Verificar()
        {
        this.setMensagem("");

        if ((this.getL1() + this.getL2()) / 2 == this.getL3())
            {
            this.setMensagem("O triângulo é Equilátero");
            }

        else if ((this.getL1() + this.getL2()) / 2 == this.getL1() || (this.getL2() + this.getL3()) / 2 == this.getL2() || (this.getL1() + this.getL3()) / 2 == this.getL1())
            {
            this.setMensagem("O triângulo é Isósceles");
            }

        else
            {
            this.setMensagem("O triângulo é Escaleno");
            }
        }
    }
