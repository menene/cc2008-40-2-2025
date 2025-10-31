import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Persona p = new Persona();
        Scanner sc = new Scanner(System.in);

        boolean seguir = true;

        while (seguir) {
            System.out.print("Ingese la edad: ");
            String age = sc.nextLine();

            try {
                p.setEdad(age);
                seguir = false;
            } catch(EdadInvalidaException e) {
                System.out.println(e.getMessage());
            } 
        }
    }
}