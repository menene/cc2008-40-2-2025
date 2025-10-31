public class Main
{
    public static void main(String[] args)
    {
        // Bulbasaur b = new Bulbasaur();
        // b.attack();

        // Gengar g = new Gengar();
        // g.attack();

        Pokemon b = new Bulbasaur();

        ((IGrass) b).bloomDoom();
        ((Bulbasaur) b).bloomDoom();
    }
}