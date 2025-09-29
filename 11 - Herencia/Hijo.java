public class Hijo extends Padre
{
    // protected int protegido;
    // public int publico;

    public Hijo(int num1, int num2, int num3)
    {
        super(num1, num2, num3);
    }

    public void test()
    {
        System.out.println(this.protegido);
        System.out.println(this.publico);
        System.out.println(super.getPrivado());
    }

    @Override
    public void saludar()
    {
        super.saludar();
        System.out.println("Que onda?");
    }
}