public class singleton {

    private static singleton instancecopy;

    public int billnumber;
    public int fireservicebillamount;
    public int securityservicebillamount;

    private singleton()
    {
        billnumber =10;
        fireservicebillamount=1000;
        securityservicebillamount=2000;
    }

    public static singleton getinstance()
    {
        if (instancecopy == null)
        {
            instancecopy = new singleton();
        }
        return instancecopy;
    }

    public int getfireserviceamount()
    {
        return fireservicebillamount;
    }
    public int getsecurityserviceamount()
    {
        return securityservicebillamount;
    }
}

