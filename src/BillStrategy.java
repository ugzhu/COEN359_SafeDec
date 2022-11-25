import java.util.HashMap;
import java.util.List;

public interface BillStrategy
{
    public long generatebill(List<Room> fireroom, List<HashMap<String, Integer>> perroomprice);
}