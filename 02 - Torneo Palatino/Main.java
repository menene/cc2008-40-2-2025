public class Main 
{
    public static void main(String[] args)
    {
        Equipo t1 = new Equipo("Barça", 1, 100);
        Equipo t2 = new Equipo("Atletico de Madrid", 2, 67);

        int totalGoles = t1.getGoles() + t2.getGoles();

        System.out.println(totalGoles);
    }
}