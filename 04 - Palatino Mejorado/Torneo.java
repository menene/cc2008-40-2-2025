public class Torneo
{
    String nombre;
    int cantidadEquipos;
    Equipo[] equipos;

    public Torneo(String nombre, int equipos)
    {
        this.nombre = nombre;
        this.cantidadEquipos = equipos;
        this.equipos = new Equipo[equipos];
    }

    public void addEquipo(int numero, Equipo e)
    {
        this.equipos[numero] = e;
    }

    public String getResumen()
    {
        String res = "=== " + this.nombre + " ===\n\n";

        for (Equipo e: equipos) {
            res += e;
        }

        return res;
    }
}