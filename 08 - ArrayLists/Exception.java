public class Exception
{
    public static void main(String[] args)
    {
        // try {
            // int r = 10 / 0;
            // System.out.println(r);

        // } catch (ArithmeticException e) {
            // System.out.println("Error aritmético: " + 
                // e.getMessage());
        // }

        int a = 10;
        int b = 10;

        if (b == 0) { 
            throw new IllegalArgumentException("b != 0");
        }
    
        double res = a / b;
    }
}