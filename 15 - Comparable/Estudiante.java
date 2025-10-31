import java.util.ArrayList;

public class Estudiante implements Comparable<Estudiante>
{
    private int carnet;
    private String nombre, carrera;
    private ArrayList<Nota> notas;

    public Estudiante(String nombre, String carrera, int carnet)
    {
        this.nombre = nombre;
        this.carrera = carrera;
        this.carnet = carnet;
        this.notas = new ArrayList<Nota>();
    }

    public void addNota(String nombre, int calificacion)
    {
        this.notas.add(
            new Nota(nombre, calificacion)
        );
    }

    public int promedio()
    {
        double suma = 0;
        int n = this.notas.size();

        for (Nota nota: this.notas) {
            suma += nota.getCalificacion();
        }

        return (int) (suma / n);
    }

    @Override
    public int compareTo(Estudiante otro) {
        return Integer.compare(this.promedio(), otro.promedio()) * -1;
    }

    @Override
    public String toString()
    {
        String res = this.carnet + " - " + this.nombre + "\n" +
            "Carrera: " + this.carrera + "\n" + 
            "Promedio: " + this.promedio() + "\n" + 
            "Notas: \n";

        for (Nota n: this.notas) {
            res += n;
        }

        return res;
    }
}