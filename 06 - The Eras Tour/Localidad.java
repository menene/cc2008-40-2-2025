public class Localidad {
    private String nombre;
    private double precio;
    private int capacidad;
    private int vendido;

    public Localidad(String nombre, double precio, int capacidad)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.capacidad = capacidad;
        this.vendido = 0;
    }

    public boolean tieneEspacio()
    {
        return (this.vendido >= this.capacidad ? false : true);
    }

    public int boletosDisponibles()
    {
        return (this.capacidad - this.vendido);
    }

    public int vender(int cantidad)
    {
        return this.vendido += cantidad;
    }

    public double getPrecio()
    {
        return this.precio;
    }

    public String getNombre()
    {
        return this.nombre;
    }
}
