public abstract class Pokemon
{
    private String name;
    private int number;
    private double height;
    private double weight;

    public Pokemon(String name, int number, double height, double weight)
    {
        this.name = "Gengar";
        this.number = 94;
        this.height = 4.11;
        this.weight = 83.9;
    }

    public abstract void attack();
}