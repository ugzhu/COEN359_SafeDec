import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConcreteBillBuilder implements BillBuilderInterface {
    private ConcreteBill obj;
    private List<Room> fireroom;
    private List<Room> securityroom;
    private int billnumber;
    public ConcreteBillBuilder(int billnumber)
    {
        this.billnumber = billnumber;
        this.obj = new ConcreteBill(billnumber);
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
    public long generatefirebill(List<HashMap<String, Integer>> perroomprice)
    {
        // get fire rooms info pass to below func
        System.out.println("setting fire info");
        long fireamt = obj.get_fire_bill(this.fireroom, perroomprice);
        return fireamt;
    }
    public long generatesecuritybill(List<HashMap<String, Integer>> perroomprice)
    {
        // get security rooms info pass to below func
        System.out.println("setting security info");
        long securityamt = obj.get_security_bill(this.securityroom, perroomprice);
        return securityamt;
    }

    //perroomprice - first fire will be added , second security with camera , second security without camera
    public String displaytotalamount(long totalamt, User obj, long fireamt, long securityamt, List<HashMap<String, Integer>> perroomprice)
    {
        // Form proper string form json object and convert to string

        // print per room price
        for (int i =0;i < perroomprice.size(); i++)
        {
            System.out.println(perroomprice.get(i));
        }

        String billinofdisplay = "Customer Info: Customer Name " + obj.get_user() + " Phone number " + obj.get_telephone() + "\n";
        billinofdisplay = billinofdisplay.concat("------------------------------------------------------" + "\n");
        billinofdisplay = billinofdisplay.concat("Contract ID : 1000 \n");
        billinofdisplay = billinofdisplay.concat("User id =" + obj.get_id() + " Bill Number =" + this.billnumber + "\n");
        billinofdisplay = billinofdisplay.concat("------------------------------------------------------" + "\n");
        billinofdisplay = billinofdisplay.concat("Per seconds Fire service amt $1" + "\n");
        billinofdisplay = billinofdisplay.concat("Per seconds Security without camera service amt $2" + "\n");
        billinofdisplay = billinofdisplay.concat("Per seconds Security with camera service amt $3" + "\n");
        billinofdisplay = billinofdisplay.concat("------------------------------------------------------" + "\n");
        billinofdisplay = billinofdisplay.concat("Per room price \n ");
        for (int i = 0; i < perroomprice.size();i++)
        {
            if (perroomprice.get(i).containsKey("Fire")) {
                billinofdisplay = billinofdisplay.concat("Per Fire room  = "  + "price $" + perroomprice.get(i).get("Fire") + "\n");

            }
        }
        for (int i = 0; i < perroomprice.size();i++)
        {
            if (perroomprice.get(i).containsKey("Security")) {
                billinofdisplay = billinofdisplay.concat("Per Security room = "  + "price $" + perroomprice.get(i).get("Security") + "\n");

            }
        }
        billinofdisplay = billinofdisplay.concat("------------------------------------------------------ : \n ");
        billinofdisplay = billinofdisplay.concat("Total Bill Amount ( Fire and Security) services = $" + totalamt + "\n");
        billinofdisplay = billinofdisplay.concat("------------------------------------------------------" + "\n");
        billinofdisplay = billinofdisplay.concat("Fire Bill Amount = $" + fireamt + "\n");
        billinofdisplay = billinofdisplay.concat("Security Bill Amount = $" + securityamt);
        System.out.println("string formed is"+billinofdisplay);
        System.out.println("final amount"+ totalamt);
        return billinofdisplay;
    }
}
