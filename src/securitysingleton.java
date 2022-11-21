import java.util.HashMap;
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

    public long getsecurityserviceamount(List<Room> securityroom, List<HashMap<String, Integer>> perroomprice)
    {
        if (securityroom.size() >0)
        {
            System.out.println("room 0 id is "+securityroom.get(0).getId());

            billstrategy bswithcamera = new concretesecuritystrategy();
            long billwithcamera = bswithcamera.generatebill(securityroom, perroomprice);

            billstrategy bswithoutcamera = new concretesecuritywithoutcamerastrategy();
            long billwithoutcamera = bswithoutcamera.generatebill(securityroom, perroomprice);

            this.securityservicebillamount = billwithcamera + billwithoutcamera;
            return this.securityservicebillamount;
        }
        return this.securityservicebillamount;
    }

}
