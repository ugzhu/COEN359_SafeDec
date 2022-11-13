public class User {

    String user;
    String password;
    String telephone;
    public User(String u, String p, String t)
    {
        this.user = u;
        this.password = p;
        this.telephone = t;
    }
    public boolean check_password()
    {
        return true;
    }
    public String get_user()
    {
        return this.user;
    }
    public  String get_password()
    {
        return this.password;
    }
    public  String get_telephone()
    {
        return this.telephone;
    }
}
