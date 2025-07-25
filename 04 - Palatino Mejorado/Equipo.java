public class Equipo
{
    String nombre;
    int puesto, esquinas, ganados, perdidos;
    int tiros, goles, amarillas, rojas, faltas;

    public Equipo(String nombre)
    {
        this.nombre = nombre;
        this.puesto = 0;
        this.amarillas = 0;
        this.goles = 0;
    }

    public Equipo(String nombre, int puesto, int goles)
    {
        this.nombre = nombre;
        this.puesto = puesto;
        this.goles = goles;
    }

    public int getGoles()
    {
        return this.goles;
    }

    public void setGoles(int goles)
    {
        this.goles = goles;
    }

    public void anotar()
    {
        this.goles++;
    }

    public void anular()
    {
        this.goles--;
    }

    public String toString()
    {
        return "\n" + this.nombre + "\n" + 
            "Puesto: " + this.puesto + "\n" + 
            "Goles: " + this.goles + "\n";
    }
}