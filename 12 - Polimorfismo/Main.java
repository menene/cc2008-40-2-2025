public class Main
{
    public static void main(String[] args)
    {
        View vista = new View();
        AuthController controller = new AuthController(vista);

        controller.start();

        // User u = new User("erick", "secret");

        // Admin a = new Admin("erick", "secret");
        // System.out.println(a.getMenu());

        // RegularUser r = new RegularUser("erick", "secret");
        // System.out.println(r.getMenu());

        // Guest g = new Guest("erick", "secret");
        // System.out.println(g.getMenu());
    }
}