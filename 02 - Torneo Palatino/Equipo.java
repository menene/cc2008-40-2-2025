public class Equipo
{
    String nombre;
    int puesto, esquinas, ganados, perdidos;
    int tiros, goles, amarillas, rojas, faltas;

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
}