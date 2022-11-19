import java.util.List;

public class firesingleton {

    private static firesingleton instancecopy;

    private int billnumber;
    private long fireservicebillamount;

    private firesingleton(int billnumber)
    {
        this.billnumber = billnumber;
        System.out.println("*****bill number is "+this.billnumber);

    }

    public static firesingleton getinstance(int billnumber)
    {
        if (instancecopy == null)
        {
            instancecopy = new firesingleton(billnumber);
        }
        return instancecopy;
    }

    public long getfireserviceamount(List<Room> fireroom)
    {

        if (fireroom.size()> 0)
        {
            billstrategy bs = new concretefirestrategy();
            this.fireservicebillamount = bs.generatebill(fireroom);
            return this.fireservicebillamount;
        }
        return this.fireservicebillamount;
    }
}

