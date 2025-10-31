public abstract class User
{
    protected String username;
    protected String password;

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    public String getUsername()
    {
        return this.username;
    }

    public boolean checkPassword(String pwd)
    {
        return this.password.equals(pwd);
    }

    public abstract String getMenu();
}