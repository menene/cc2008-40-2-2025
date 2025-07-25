public class Main 
{
    public static void main(String[] args)
    {
        Torneo palatino = new Torneo("Torneo Palatino", 5);

        Equipo t1 = new Equipo("Barça");
        Equipo t2 = new Equipo("Atletico de Madrid");
        Equipo t3 = new Equipo("Real Madrid");
        Equipo t4 = new Equipo("Valencia");
        Equipo t5 = new Equipo("Girona");

        palatino.addEquipo(0, t1);
        palatino.addEquipo(1, t2);
        palatino.addEquipo(2, t3);
        palatino.addEquipo(3, t4);
        palatino.addEquipo(4, t5);

        t1.anotar();

        System.out.println(palatino.getResumen());
    }
}