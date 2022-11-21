import java.util.HashMap;
import java.util.List;

public interface billstrategy
{
    public long generatebill(List<Room> fireroom, List<HashMap<String, Integer>> perroomprice);
}