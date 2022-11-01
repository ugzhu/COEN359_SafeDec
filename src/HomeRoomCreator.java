// to-do: make it singleton

import java.util.HashMap;

public class HomeRoomCreator implements RoomCreator{

    public Room createHomeRoom(int id){

        Room r = new HomeRoom(id);
        return r;
    }

}
