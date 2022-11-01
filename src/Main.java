import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
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


        // dummy layout looks like: [{security=true, fire=true, id=1, camera=true},
        //                           {security=false, fire=true, id=2, camera=true},
        //                           {security=true, fire=false, id=3, camera=false}]


        // value passed from GUI: layout, startTime, endTime


        //////////////////////////////////
        ///////    Yujie      ///////////
        /////////////////////////////////

        /// create all rooms with/without services and camera
        List<Room> rooms = new ArrayList<>();
        RoomBuilder roomBuilder = new HomeRoomBuilder();
        for (int i = 0; i < layout.size(); i++) {
            Room r = roomBuilder.buildRoom(layout.get(i));
            rooms.add(r);
        }

        /// create schedule
        Schedule schedule = new Schedule(startTime, endTime);
        System.out.println(schedule.getDuration());

        // data generated: List<Room> rooms, Schedule schedule



        //////////////////////////////////
        ///////    Hamani      //////////
        /////////////////////////////////

        //Need to call singleton class
        System.out.println("Hello world!");
        singleton instance1 = singleton.getinstance();

        System.out.println(instance1.getfireserviceamount());

        singleton instance2 = singleton.getinstance();
        System.out.println(instance2.getsecurityserviceamount());
    }
}
