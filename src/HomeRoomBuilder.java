import java.util.HashMap;

public class HomeRoomBuilder implements RoomBuilder{
    RoomCreator roomCreator;
    Factory fireFactory;
    Factory securityFactory;

    // Singleton
    static private HomeRoomBuilder instance_  = new HomeRoomBuilder();
    static public HomeRoomBuilder instance() {    return instance_;  }

    private HomeRoomBuilder(){
        this.roomCreator = HomeRoomCreator.instance();
        this.fireFactory = new FireFactory();
        this.securityFactory = new SecurityFactory();
    }

    public Room buildRoom(HashMap<String, Object> roomSpec){
        if (!roomSpec.containsKey("id") || !roomSpec.containsKey("fire")
                || !roomSpec.containsKey("security") || !roomSpec.containsKey("camera")
                || !roomSpec.containsKey("startTime") || !roomSpec.containsKey("endTime")){
            System.out.println("Incorrect Room Spec Input");
            return null;
        }

        int id;
        boolean fire;
        boolean security;
        boolean camera;
        String startTime;
        String endTime;
        Schedule schedule;

        try{
            id = (int) roomSpec.get("id");
            fire = (boolean) roomSpec.get("fire");
            security = (boolean) roomSpec.get("security");
            camera = (boolean) roomSpec.get("camera");
            startTime = (String) roomSpec.get("startTime");
            endTime = (String) roomSpec.get("endTime");
        }catch (ClassCastException e){
            return null;
        }

        Room r = roomCreator.createHomeRoom(id);
        schedule = new HomeSchedule(startTime, endTime);

        if (camera) {r.addCamera();}
        if (fire) {r.addFireService(fireFactory.createService());}
        if (security) {r.addSecurityService(securityFactory.createService());}
        r.addSchedule(schedule);

        return r;
    }
}
