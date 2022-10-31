public class Main {
    /// create room Yujie


    /// create schedule Yujie


    //Need to call singleton class
    public static void main(String[] args) {

        System.out.println("Hello world!");
        singleton instance1 = singleton.getinstance();

        System.out.println(instance1.getfireserviceamount());

        singleton instance2 = singleton.getinstance();
        System.out.println(instance2.getsecurityserviceamount());
    }
}
