public class Cliente {
    private String nombre;
    private String correo;
    private int cantidad;
    private double presupuesto;
    private Ticket ticket;

    public Cliente(String nombre, String correo, int cantidad, double presupuesto) 
    {
        this.nombre = nombre;
        this.correo = correo;
        this.cantidad = cantidad;
        this.presupuesto = presupuesto;
        this.ticket = null;
    }

    public Ticket getTicket()
    {
        return this.ticket;
    }

    public void setTicket(Ticket t)
    {
        this.ticket = t;
    }

    public int getCantidad()
    {
        return this.cantidad;
    }

    public double getPresupuesto()
    {
        return this.presupuesto;
    }

    public String toString()
    {
        return this.nombre + " - " + this.correo + this.ticket;
    }
}
