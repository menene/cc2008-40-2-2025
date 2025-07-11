public class Main 
{
    public static void main(String[] args)
    {
        // Perro miPerro = new Perro();
        // miPerro.setNombre("Terremotito");
        // miPerro.setRaza("Pomeranian");
        // miPerro.setEdad(3);

        // System.out.println(miPerro.getNombre());

        // Perro tuPerro = new Perro();
        // tuPerro.setNombre("Santito");
        // tuPerro.setRaza("Pitbull");
        // tuPerro.setEdad(1);

        // System.out.println(tuPerro.getNombre());

        Perro miPerro = new Perro("Terremotito", "Pomeranian", 3);
        System.out.println(miPerro.getNombre());
    }
}