public class Perro
{
    private String nombre, raza;
    private int edad;

    // constructor
    public Perro(String nombre, String raza, int edad)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setRaza(String raza)
    {
        this.raza = raza;
    }

    public void setEdad(int edad)
    {
        this.edad = edad;
    }

    // getters
    public String getNombre()
    {
        return this.nombre;
    }
}