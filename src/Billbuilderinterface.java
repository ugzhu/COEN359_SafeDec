import java.util.List;

public interface Billbuilderinterface {
    public void get_fire_rooms_info(List<Room> rooms);
    public void get_security_rooms_info(List<Room> rooms);
    public long generatefirebill();
    public long generatesecuritybill();
    public long calculate_totalamount(long famt, long samt);
    public String displaytotalamount(long amt, User obj);
}