import java.util.HashMap;
import java.util.List;

public interface BillBuilderInterface {
    public void get_fire_rooms_info(List<Room> rooms);
    public void get_security_rooms_info(List<Room> rooms);
    public long generatefirebill(List<HashMap<String, Integer>> perroomprice);
    public long generatesecuritybill(List<HashMap<String, Integer>> perroomprice);
    public long calculate_totalamount(long famt, long samt);
    public String displaytotalamount(long totalamt, User obj, long fireamt, long securityamt, List<HashMap<String, Integer>> perroomprice);
}