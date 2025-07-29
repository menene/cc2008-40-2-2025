import java.util.Random;

public class Ticket {
    private int numero;
    private int a;
    private int b;
    private boolean puedeVender;
    private int numLocalidad;

    public Ticket() 
    {
        Random random = new Random();

        this.a = random.nextInt(1, 15001);
        this.b = random.nextInt(1, 15001);
        this.numero = random.nextInt(1, 15001);

        this.puedeVender = false;
        this.numLocalidad = 0;
        if (a <= b) {
            if (numero >= a && numero <= b) {
                this.puedeVender = true;
            }
        } else {
            if (numero <= a && numero >= b) {
                this.puedeVender = true;
            }
        }

        if (this.puedeVender) {
            this.numLocalidad = random.nextInt(1, 4);
        }
    }

    public int getNumero()
    {
        return this.numero;
    }

    public boolean getPuedeVender()
    {
        return this.puedeVender;
    }

    public int getLocalidad()
    {
        return this.numLocalidad;
    }

    public String toString()
    {
        return "\nTicket número: " + this.numero + "\n(a= " + this.a + ", b= " + this.b + ")\nPuede vender: " + this.puedeVender + "\nLocalidad:" + this.numLocalidad;
    }
}
