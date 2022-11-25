import java.util.HashMap;
import java.util.List;

public class FireSingleton {

    private static FireSingleton instancecopy;

    private int billnumber;
    private long fireservicebillamount;

    private FireSingleton(int billnumber)
    {
        this.billnumber = billnumber;
        System.out.println("*****bill number is "+this.billnumber);

    }

    public static FireSingleton getinstance(int billnumber)
    {
        if (instancecopy == null)
        {
            instancecopy = new FireSingleton(billnumber);
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

