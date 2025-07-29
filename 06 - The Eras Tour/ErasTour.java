public class ErasTour {
    private Localidad localidad1;
    private Localidad localidad5;
    private Localidad localidad10;

    public ErasTour()
    {
        this.localidad1 = new Localidad("Localidad 1", 100, 20);
        this.localidad5 = new Localidad("Localidad 5", 500, 20);
        this.localidad10 = new Localidad("Localidad 10", 1000, 20);
    }

    public boolean nuevoTicket(Cliente cliente)
    {
        System.out.println(cliente);

        if (!cliente.getTicket().getPuedeVender()) {
            System.out.println("Tu ticket no se puede vender :(");
            return false;
        }

        // Validacion 1 - Capacidad disponible
        // Validacion 2 - Capacidad suficiante
        boolean v1 = false;
        boolean v2 = false;
        int numLocalidad = cliente.getTicket().getLocalidad();

        if (numLocalidad == 1) {
            System.out.println("Validado en localidad 1...");
            if (this.localidad1.tieneEspacio()) {
                System.out.println("Localidad con espacio.");
                v1 = true;
                
                if (this.localidad1.boletosDisponibles() >= cliente.getCantidad()) {
                    System.out.println("Localidad con capacidad.");
                    v2 = true;
                }
            }
        } else if (numLocalidad == 2) {
            System.out.println("Validado en localidad 2...");
            if (this.localidad5.tieneEspacio()) {
                System.out.println("Localidad con espacio.");
                v1 = true;

                if (this.localidad5.boletosDisponibles() >= cliente.getCantidad()) {
                    System.out.println("Localidad con capacidad.");
                    v2 = true;
                }
            }
        } else {
            System.out.println("Validado en localidad 3...");
            if (this.localidad10.tieneEspacio()) {
                System.out.println("Localidad con espacio.");
                v1 = true;

                if (this.localidad10.boletosDisponibles() >= cliente.getCantidad()) {
                    System.out.println("Localidad con capacidad.");
                    v2 = true;
                }
            }
        }

        if (!v1) {
            System.out.println("Localidad sin espacio...");
            return false;
        }

        if (!v2) {
            System.out.println("Localidad sin disponibilidad...");
            return false;
        }





        return true;
    }

    public void disponibilidadTotal()
    {

    }

    public void diponibilidadLocalidad(int codigo)
    {

    }

    public void reporteCaja()
    {
        
    }
}
