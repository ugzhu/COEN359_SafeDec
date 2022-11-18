import java.util.ArrayList;
import java.util.List;

public class ConcreteBillBuilder implements Billbuilderinterface{
    private concretebill obj;
    private List<Room> fireroom;
    private List<Room> securityroom;
    public ConcreteBillBuilder(int billnumber)
    {
        this.obj = new concretebill(billnumber);
        this.fireroom = new ArrayList<Room>();
        this.securityroom = new ArrayList<Room>();
    }
    public void get_fire_rooms_info(List<Room> rooms)
    {
        for( int i =0; i < rooms.size(); i++)
        {
            if (rooms.get(i).hasFireService() == true)
            {
                this.fireroom.add(rooms.get(i));
            }
        }

    }
    public void get_security_rooms_info(List<Room> rooms)
    {
        for( int i =0; i < rooms.size(); i++)
        {
            if (rooms.get(i).hasSecurityService() == true)
            {
                this.securityroom.add(rooms.get(i));
            }
        }
    }
    public long calculate_totalamount(long fireamount, long securityamount)
    {
        long total = fireamount + securityamount;
        return total;
    }
    public long generatefirebill()
    {
        // get fire rooms info pass to below func
        System.out.println("setting fire info");
        long fireamt = obj.get_fire_bill(this.fireroom);
        return fireamt;
    }
    public long generatesecuritybill()
    {
        // get security rooms info pass to below func
        System.out.println("setting security info");
        long securityamt = obj.get_security_bill(this.securityroom);
        return securityamt;
    }
    public String displaytotalamount(long totalamt, User obj)
    {
        // Form proper string form json object and convert to string

        String billinofdisplay = "Bill information for the user " + obj.get_user() +" with phone number registered" + obj.get_telephone();
        billinofdisplay = billinofdisplay.concat("with user id " + obj.get_id());
        billinofdisplay = billinofdisplay.concat("Total bill amount for both fire and security service is " + totalamt);
        System.out.println("string formed is"+billinofdisplay);
        System.out.println("final amount"+ totalamt);
        return billinofdisplay;
    }
}
