import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class concretefirestrategy implements billstrategy{
    private int price_for_a_second = 1;
    public long generatebill(List<Room> fireroom, List<HashMap<String, Integer>> perroomprice)
    {
        long fireamt = 0;
        Integer perroomfireamt = 0;
        for (int i=0;i< fireroom.size();i++)
        {
            long schedule_duration = fireroom.get(i).getSchedule().getDuration();
            perroomfireamt = Integer.valueOf((price_for_a_second * (int)schedule_duration));
            HashMap<String, Integer> hm = new HashMap<>();
            hm.put("amt",perroomfireamt );
            perroomprice.add(hm);
            System.out.println("schedule duration is "+schedule_duration);
            fireamt = fireamt + (price_for_a_second * schedule_duration);
            System.out.println("fire amt is "+fireamt);
            perroomfireamt =0;
        }
        return fireamt;

    }
}
