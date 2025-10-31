public class Admin extends User
{
    public Admin(String username, String password)
    {
        super(username, password);
    }

    @Override
    public String getMenu()
    {
        return """
            ==== ADMIN MENU ====
            1. Reporte de ventas
            2. Reporte de compras
            3. Productos
            4. Usuarios
            5. Salir
        """;
    }
}