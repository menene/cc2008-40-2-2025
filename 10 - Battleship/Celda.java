// modelo

public class Celda
{
    private boolean tieneBarco;
    private boolean disparada;

    public Celda()
    {
        this.tieneBarco = false;
        this.disparada = false;
    }

    public boolean tieneBarco() {
        return this.tieneBarco;
    }

    public boolean estaDisparada() {
        return this.disparada;
    }

    public void ponerBarco() {
        this.tieneBarco = true;
    }

    public void disparar() {
        this.disparada = true;
    }

    @Override
    public String toString() {
        if (!this.disparada) {
            return ".";
        } else {
            return this.tieneBarco ? "X" : "O";
        }
    }

    public String cheat() {
        if (this.disparada && this.tieneBarco) {
            return "X";
        } else if(this.tieneBarco) {
            return "S";
        } else if (this.disparada) {
            return "O";
        } else {
            return ".";
        }
    }
}