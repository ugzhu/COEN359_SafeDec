import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BackendEntryPoint {

    public String EntryMainfunc (ArrayList<HashMap<String, Object>> roomlist, User userinput) {
        System.out.println("********Backend Execution started");

        User userobj = userinput;

        System.out.println("Input passed from UI:");
        /// create all rooms with/without services and camera
        List<Room> rooms = new ArrayList<>();
        RoomBuilder roomBuilder = HomeRoomBuilder.instance();
        for (int i = 0; i < roomlist.size(); i++) {
            System.out.println(roomlist.get(i));
            Room r = roomBuilder.buildRoom(roomlist.get(i));
            rooms.add(r);
        }

        //Calling bill generation logic
        List<HashMap<String, Integer>> perroomprice = new ArrayList<HashMap<String, Integer>>();
        int billnumber = 1;
        BillBuilderInterface cbobj = new ConcreteBillBuilder(billnumber);
        cbobj.get_fire_rooms_info(rooms);
        long fireamt = cbobj.generatefirebill(perroomprice);
        System.out.println("in backend entry fire amt"+fireamt);
        cbobj.get_security_rooms_info(rooms);
        long securityamt = cbobj.generatesecuritybill(perroomprice);
        System.out.println("in backend entry security amt"+securityamt);
        long totalamt = cbobj.calculate_totalamount(fireamt, securityamt);
        System.out.println("in backend entry totalamt"+totalamt);
        String billforuser = cbobj.displaytotalamount(totalamt, userobj, fireamt, securityamt, perroomprice);
        // pass billforuser to UI.
        return billforuser;
    }
}
