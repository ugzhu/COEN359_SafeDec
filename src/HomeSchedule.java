public class HomeSchedule implements  Schedule{
    private String startTime;
    private String endTime;

    public HomeSchedule(String startTime, String endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getDuration(){
        return timeToSeconds(endTime) - timeToSeconds(startTime);
    }


}
