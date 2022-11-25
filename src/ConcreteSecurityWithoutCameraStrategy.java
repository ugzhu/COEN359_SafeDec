import java.util.HashMap;
import java.util.List;

public class ConcreteSecurityWithoutCameraStrategy implements BillStrategy {
        private int  price_for_a_second_with_camera = 2;
        public long generatebill(List<Room> securityroom, List<HashMap<String, Integer>> perroomprice)
        {
            long securityamt = 0;
            Integer perroomsecurityamt = 0;
            for (int i=0;i<securityroom.size();i++)
            {
                if (securityroom.get(i).hasCamera() == false)
                {
                    long schedule_duration = securityroom.get(i).getSchedule().getDuration();
                    perroomsecurityamt = Integer.valueOf((price_for_a_second_with_camera * (int)schedule_duration));
                    HashMap<String, Integer> hm = new HashMap<>();
                    hm.put("amt",perroomsecurityamt );
                    perroomprice.add(hm);
                    System.out.println("schedule duration is "+schedule_duration);
                    securityamt = securityamt + (price_for_a_second_with_camera * schedule_duration);
                    System.out.println("sec amt is "+securityamt);
                    perroomsecurityamt = 0;
                }

            }
            return securityamt;

        }
}

