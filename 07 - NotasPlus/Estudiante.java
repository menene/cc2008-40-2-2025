public class Estudiante 
{
    private String nombre, carnet, carrera;

    public Estudiante(String nombre, String carnet, String carrera) 
    {
        this.nombre = nombre;
        this.carnet = carnet;
        this.carrera = carrera;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getCarnet() 
    {
        return carnet;
    }

    public String getCarrera() 
    {
        return carrera;
    }
}
