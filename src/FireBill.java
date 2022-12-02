import java.util.HashMap;
import java.util.List;

public class FireBill {

    private static FireBill instancecopy;

    private int billnumber;
    private long fireservicebillamount;

    private FireBill(int billnumber)
    {
        this.billnumber = billnumber;
        System.out.println("*****bill number is "+this.billnumber);

    }

    public static FireBill getinstance(int billnumber)
    {
        if (instancecopy == null)
        {
            instancecopy = new FireBill(billnumber);
        }
        return instancecopy;
    }

    public long getfireserviceamount(List<Room> fireroom, List<HashMap<String, Integer>> perroomprice)
    {

        if (fireroom.size()> 0)
        {
            BillStrategy bs = new ConcreteFireStrategy();
            this.fireservicebillamount = bs.generatebill(fireroom, perroomprice);
            return this.fireservicebillamount;
        }
        return this.fireservicebillamount;
    }
}

