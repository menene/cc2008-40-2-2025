public class Main
{
    public static void main(String[] args)
    {
        Calculadora calc = new Calculadora();

        try {
            calc.dividir(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.prinln(e.getMessage());
        }
    } 
}