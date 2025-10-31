public class Bulbasaur extends Pokemon implements IGrass, IPoison
{
    public Bulbasaur()
    {
        super("Bulbasaur", 1, 2.04, 15.2);
    }

    @Override
    public void attack()
    {
        this.bloomDoom();
        this.grassKnot();
        this.direClaw();
        this.gunkShot();
    }

    @Override
    public void bloomDoom()
    {
        System.out.println("Bulbasaur is Boom Dooming");
    }

    @Override
    public void grassKnot()
    {
        System.out.println("Bulbasaur is Grass Knotting");
    }

    @Override
    public void direClaw()
    {
        System.out.println("Bulbasaur is Dire Clawing");
    }

    @Override
    public void gunkShot()
    {
        System.out.println("Bulbasaur is Gunk Shooting");
    }
}