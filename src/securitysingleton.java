import java.util.List;

public class securitysingleton {

    private static securitysingleton instancecopy;

    private int billnumber;
    private long securityservicebillamount;

    private securitysingleton(int billnumber)
    {
        this.billnumber = billnumber;
        System.out.println("*****bill number is "+this.billnumber);

    }

    public static securitysingleton getinstance(int billnumber)
    {
        if (instancecopy == null)
        {
            instancecopy = new securitysingleton(billnumber);
        }
        return instancecopy;
    }

    public long getsecurityserviceamount(List<Room> securityroom)
    {
        System.out.println("room 0 id is "+securityroom.get(0).getId());
        billstrategy bswithcamera = new concretesecuritystrategy();
        long billwithcamera = bswithcamera.generatebill(securityroom);
        billstrategy bswithoutcamera = new concretesecuritywithoutcamerastrategy();
        long billwithoutcamera = bswithoutcamera.generatebill(securityroom);
        this.securityservicebillamount = billwithcamera + billwithoutcamera;
        return this.securityservicebillamount;
    }

}
