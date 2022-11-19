import java.util.List;

public class concretefirestrategy implements billstrategy{
    private long price_for_a_second = 1;
    public long generatebill(List<Room> fireroom)
    {
        long fireamt = 0;
        for (int i=0;i< fireroom.size();i++)
        {
            long schedule_duration = fireroom.get(i).getSchedule().getDuration();
            System.out.println("schedule duration is "+schedule_duration);
            fireamt = fireamt + (price_for_a_second * schedule_duration);
            System.out.println("fire amt is "+fireamt);

        }
        return fireamt;

    }
}
