public class FireFactory implements Factory{


    public Service createService() {
        return new FireService();
    }
}
