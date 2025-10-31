public class RegularUser extends User
{
    public RegularUser(String username, String password)
    {
        super(username, password);
    }

    @Override
    public String getMenu()
    {
        return """
            ==== USER MENU ====
            1. Reporte de ventas
            2. Reporte de compras
            3. Salir
        """;
    }
}