public class Main 
{
    public static void main(String[] args)
    {
        Equipo t1 = new Equipo("Barça", 1, 100);
        Equipo t2 = new Equipo("Atletico de Madrid", 2, 67);

        Equipo t3 = new Equipo("Real Madrid");
        t3.setGoles(1);
        t3.anotar();
        t3.anotar();

        int totalGoles = t1.getGoles() + t2.getGoles() + t3.getGoles();

        System.out.println(totalGoles);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}