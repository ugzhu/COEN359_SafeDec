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
        if (!roomSpec.containsKey("id") || !roomSpec.containsKey("Fire")
                || !roomSpec.containsKey("Security") || !roomSpec.containsKey("startTime") || !roomSpec.containsKey("endTime")){
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
        String days;

        try{
            id = (int) roomSpec.get("id");
            fire = (boolean) roomSpec.get("Fire");
            security = (boolean) roomSpec.get("Security");
            startTime = (String) roomSpec.get("startTime");
            endTime = (String) roomSpec.get("endTime");
            days = (String) roomSpec.get("days");
        }catch (ClassCastException e){
            return null;
        }
        try{
            camera = (boolean) roomSpec.get("Camera");
        }
        catch(NullPointerException e){
            camera = false;
        }

        Room r = roomCreator.createHomeRoom(id);

        if (camera) {r.addCamera();}
        if (fire) {r.addFireService(fireFactory.createService());}
        if (security) {r.addSecurityService(securityFactory.createService());}

        schedule = new HomeSchedule(startTime, endTime);
        if (!days.equals("") == !days.equals("1")) {
            for (int i = 2; i <= Integer.parseInt(days); i++) {
                schedule = new AddOneDayDecorator(schedule);
            }
        }
        r.addSchedule(schedule);

        return r;
    }
}
