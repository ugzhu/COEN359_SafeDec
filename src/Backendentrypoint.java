import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Backendentrypoint {

    public void EntryMainfunc (ArrayList<HomeRoomCreator> roomlist, User userinput) {
        System.out.println("********Backend Execution started");

        User userobj = userinput;
        //dummy values passed from GUI
        List<HashMap> layout = new ArrayList<>();
        HashMap<String, Object> room1 = new HashMap<>();
        HashMap<String, Object> room2 = new HashMap<>();
        HashMap<String, Object> room3 = new HashMap<>();
        String startTime;
        String endTime;

        room1.put("id", 1);
        room1.put("fire", true);
        room1.put("security", true);
        room1.put("camera", true);

        room2.put("id", 2);
        room2.put("fire", true);
        room2.put("security", false);
        room2.put("camera", true);

        room3.put("id", 3);
        room3.put("fire", false);
        room3.put("security", true);
        room3.put("camera", false);

        layout.add(room1);
        layout.add(room2);
        layout.add(room3);

        startTime = "00:00:00";
        endTime = "23:59:59";

        // Data from GUI
        // dummy layout looks like: [{security=true, fire=true, id=1, camera=true, schedule obj1},
        //                           {security=false, fire=true, id=2, camera=true, schedule obj2},
        //                           {security=true, fire=false, id=3, camera=false, schedule obj3}]


        // value passed from GUI: layout, schedule object


        //////////////////////////////////
        ///////    Yujie      ///////////
        /////////////////////////////////

        /// create all rooms with/without services and camera
        List<Room> rooms = new ArrayList<>();
        RoomBuilder roomBuilder = HomeRoomBuilder.instance();
        for (int i = 0; i < layout.size(); i++) {
            Room r = roomBuilder.buildRoom(layout.get(i));
            rooms.add(r);
        }

        /// create schedule this will come from UI . UI will create object and send reference to it.
        Schedule schedule = new Schedule(startTime, endTime);
        System.out.println(schedule.getDuration());

        // data generated: List<Room> rooms, Schedule schedule


        // Covered - simuated in GUI. Will review , so that we dont need it here.
        //////// demo break in////

        //sleep for 1 min
        //HashMap<String, Room> break_in_demo = new HashMap<>();
        // {"break-in" : rooms.get(0)}
    }
}
