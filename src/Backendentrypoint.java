import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Backendentrypoint {

    public void EntryMainfunc (List<HashMap<String, Object>> spec, User user) {
        System.out.println("********Backend Execution started");




        // dummy spec looks like: [{"security"=true, "fire"=true, "id"=1, "camera"=true, "startTime"="01:11:22", "endTime"="16:42:59"},
        //                           {"security"=false, "fire"=true, "id"=2, "camera"=true, "startTime"="01:11:22", "endTime"="16:42:59"},
        //                           {"security"=true, "fire"=false, "id"=3, "camera"=false, "startTime"="01:11:22", "endTime"="16:42:59"}]



//        HashMap<String, Object> rm1 = new HashMap<>();
//        rm1.put("security", true);
//        rm1.put("fire", true);
//        rm1.put("camera", true);
//        rm1.put("id", 1);
//        rm1.put("startTime", "01:11:22");
//        rm1.put("endTime", "16:42:59");
//        HashMap<String, Object> rm2 = new HashMap<>();
//        HashMap<String, Object> rm3 = new HashMap<>();
//
//        List<HashMap<String, Object>> spec = new ArrayList<>();
//        info.add(rm1);
//        info.add(rm2);
//        info.add(rm3);




        // value passed from GUI: layout, schedule object


        //////////////////////////////////
        ///////    Yujie      ///////////
        /////////////////////////////////

        /// create all rooms with/without services and camera
        List<Room> rooms = new ArrayList<>();
        RoomBuilder roomBuilder = HomeRoomBuilder.instance();
        for (HashMap<String, Object> stringObjectHashMap : spec) {
            Room r = roomBuilder.buildRoom(stringObjectHashMap);
            rooms.add(r);
        }


        // data generated: List<Room> rooms // 3 rooms in total
        // Room room = rooms.get(0)

        // check fire service: room.hasFireService -> boolean
        // check security service: room.hasSecurityService -> boolean
        // check camera: room.hasCamera -> boolean
        // get id: room.getId() -> int
        // get duration room.getSchedule.getDuration() -> long


        // Covered - simuated in GUI. Will review , so that we dont need it here.
        //////// demo break in////

        //sleep for 1 min
        //HashMap<String, Room> break_in_demo = new HashMap<>();
        // {"break-in" : rooms.get(0)}
    }
}
