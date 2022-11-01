public class SecurityFactory implements Factory{

    public Service createService() {
        return new SecurityService();
    }
}
