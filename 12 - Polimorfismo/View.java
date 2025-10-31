import java.util.Scanner;

public class View 
{
    private Scanner sc = new Scanner(System.in);

    public void showMainMenu()
    {
        System.out.println("==== MAIN MENU ====");
        System.out.println("1. Registro");
        System.out.println("2. Login");
        System.out.println("3. Salir");
    }

    public void showMessage(String message)
    {
        System.out.println(message);
    }

    public int askOption(String text)
    {
        System.out.print(text);

        int choice = sc.nextInt();
        sc.nextLine();

        return choice;
    }
}