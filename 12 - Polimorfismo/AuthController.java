import java.util.ArrayList;

public class AuthController
{
    private ArrayList<User> users = new ArrayList<>();
    private View view;
    private boolean run;

    public AuthController(View view)
    {
        this.view = view;
        this.run = true;
    }

    public void start()
    {
        while (this.run) {
            view.showMainMenu();
            int choice = view.askOption("Selecciona una opción: ");

            switch (choice) {
                case 1:
                    this.register();
                    break;

                case 2:
                    this.login();
                    break;

                case 3:
                    this.run = false;
                    break;

                default:
                    this.view.showMessage("Opción inválida");
                    break;
            }
        }
    }

    public void register()
    {
        String username = this.view.askUsername();
        String password = this.view.askPassword();
        int role = this.view.askRole();

        // User a;
        // if (role == 1) {
        //     a = new Admin(username, password);
        // } else if (role == 2) {
        //     a = new RegularUser(username, password);
        // } else {
        //     a = new Guest(username, password);
        // }

        // User newUser;
        // switch (role) {
        //     case 1 -> newUser = new Admin(username, password);
        //     case 2 -> newUser = new RegularUser(username, password);
        //     default -> newUser = new Guest(username, password);
        // }

        User newUser;
        switch (role) {
            case 1:
                newUser = new Admin(username, password);
                break;
            
            case 2:
                newUser = new RegularUser(username, password);
                break;

            default:
                newUser = new Guest(username, password);
                break;
        }

        this.users.add(newUser);
        this.view.showMessage("Usuario registrado exitosamente");
    }

    public void login()
    {
        System.out.println("SELECCIONASTE LOGIN");
    }
}