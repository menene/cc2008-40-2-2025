public class Gengar extends Pokemon implements IPoison
{
    public Gengar()
    {
        super("Gengar", 94, 4.11, 83.9);
    }

    @Override
    public void attack()
    {
        this.direClaw();
        this.gunkShot();
    }

    @Override
    public void direClaw()
    {
        System.out.println("Gengar is Dire Clawing");
    }

    @Override
    public void gunkShot()
    {
        System.out.println("Gengar is Gunk Shooting");
    }
}