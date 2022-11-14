import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //dummy values passed from GUI
        List<HashMap<String, Object>> layout = new ArrayList<>();
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


        // dummy layout looks like: [{security=true, fire=true, id=1, camera=true，startTime="00:00:10", endTime="22:11:22"},
        //                           {security=false, fire=true, id=2, camera=true, startTime="00:00:10", endTime="22:11:22"},
        //                           {security=true, fire=false, id=3, camera=false, startTime="00:00:10", endTime="22:11:22"}]


        // value passed from GUI: layout, startTime, endTime


        //////////////////////////////////
        ///////    Yujie      ///////////
        /////////////////////////////////

        /// create all rooms with/without services and camera
        List<Room> rooms = new ArrayList<>();
        RoomBuilder roomBuilder = HomeRoomBuilder.instance();
        for (HashMap<String, Object> stringObjectHashMap : layout) {
            Room r = roomBuilder.buildRoom(stringObjectHashMap);
            rooms.add(r);
        }


        // create user
        String username = "my_username";
        String password = "my_pwd";
        String phone = "my_phone";
        User user = new HomeUser(username, password, phone);

        // data generated: List<Room> rooms, User user

        // check fire service: room.hasFireService -> boolean
        // check security service: room.hasSecurityService -> boolean
        // check camera: room.hasCamera -> boolean
        // get id: room.getId() -> int
        // get duration room.getSchedule.getDuration() -> long

        // get password: user.getPassword() -> String
        // get username: user.getUsername() -> String
        // get phone: user.getPhone() -> String



        //////////////////////////////////
        ///////    Himani      //////////
        /////////////////////////////////

        //Need to call singleton class
        System.out.println("Hello world!");
        singleton instance1 = singleton.getinstance();

        System.out.println(instance1.getfireserviceamount());

        singleton instance2 = singleton.getinstance();
        System.out.println(instance2.getsecurityserviceamount());


        //////// demo break in////
        //sleep for 1 min
        HashMap<String, Room> break_in_demo = new HashMap<>();
        // {"break-in" : rooms.get(0)}
    }
}
