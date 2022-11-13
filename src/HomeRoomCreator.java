
public class HomeRoomCreator implements RoomCreator{

    // Singleton
    static private HomeRoomCreator instance_  = new HomeRoomCreator();
    static public HomeRoomCreator instance() {    return instance_;  }
    public HomeRoomCreator(){}

    public Room createHomeRoom(int id){

        Room r = new HomeRoom(id);
        return r;
    }

}
