public class calcularPromedioGeneral
{

    public int dividir(int a, int b) throws IllegalArgumentException {
        if (b == 0) { 
            throw new IllegalArgumentException("b != 0");
        }
    
        return a / b;
    }
}
}