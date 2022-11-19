import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Backendentrypoint {

    public String EntryMainfunc (ArrayList<HashMap<String, Object>> roomlist, User userinput) {
        System.out.println("********Backend Execution started");

        User userobj = userinput;

        /// create all rooms with/without services and camera
        List<Room> rooms = new ArrayList<>();
        RoomBuilder roomBuilder = HomeRoomBuilder.instance();
        for (int i = 0; i < roomlist.size(); i++) {
            Room r = roomBuilder.buildRoom(roomlist.get(i));
            System.out.println("start time is "+roomlist.get(i).get("startTime"));
            rooms.add(r);
        }

        // data generated: List<Room> rooms, Schedule schedule

        //Calling bill generation logic
        int billnumber = 1;
        ConcreteBillBuilder cbobj = new ConcreteBillBuilder(billnumber);
        cbobj.get_fire_rooms_info(rooms);
        long fireamt = cbobj.generatefirebill();
        cbobj.get_security_rooms_info(rooms);
        long securityamt = cbobj.generatesecuritybill();
        long totalamt = cbobj.calculate_totalamount(fireamt, securityamt);
        String billforuser = cbobj.displaytotalamount(totalamt, userobj);
        // pass billforuser to UI.
        return billforuser;
    }
}
