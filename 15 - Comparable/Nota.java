public class Nota
{
    private String nombre;
    private int calificacion;

    public Nota(String nombre, int calificacion)
    {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public int getCalificacion()
    {
        return this.calificacion;
    }

    @Override
    public String toString()
    {
        return this.nombre + " (" + this.calificacion + ")\n";
    }
}