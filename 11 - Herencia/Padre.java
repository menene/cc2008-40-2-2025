public class Padre
{
    private int privado;
    protected int protegido;
    public int publico;

    public Padre(int num1, int num2, int num3)
    {
        this.privado = num1;
        this.protegido = num2;
        this.publico = num3;
    }

    public void saludar()
    {
        System.out.println("Buenos días");
    }

    public int getPrivado()
    {
        return this.privado;
    }
}