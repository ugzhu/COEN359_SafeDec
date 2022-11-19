import java.util.List;

public class concretesecuritywithoutcamerastrategy implements billstrategy{
        long price_for_a_second_with_camera = 2;
        public long generatebill(List<Room> securityroom)
        {
            long securityamt = 0;
            for (int i=0;i<securityroom.size();i++)
            {
                if (securityroom.get(i).hasCamera() == false)
                {
                    long schedule_duration = securityroom.get(i).getSchedule().getDuration();
                    System.out.println("schedule duration is "+schedule_duration);
                    securityamt = securityamt + (price_for_a_second_with_camera * schedule_duration);
                    System.out.println("sec amt is "+securityamt);
                }

            }
            return securityamt;

        }
}

