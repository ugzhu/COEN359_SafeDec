public class HomeUser implements User{
    private String username;
    private String password;
    private String phone;

    public HomeUser(String username, String password, String phone){
        this.username = username;
        this.password = password;
        this.phone = phone;
    }


    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getPhone() {
        return this.phone;
    }
}
