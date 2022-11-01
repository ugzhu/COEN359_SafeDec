public class Schedule {
    private String startTime;
    private String endTime;
    public Schedule(String startTime, String endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getDuration(){
        return timeToSeconds(endTime) - timeToSeconds(startTime);
    }

    private long timeToSeconds(String time){
        long HH = (int) time.charAt(0) * 10 + (int) time.charAt(1);
        long MM = (int) time.charAt(3) * 10 + (int) time.charAt(4);
        long SS = (int) time.charAt(6) * 10 + (int) time.charAt(7);

        return SS + MM * 60 + HH * 3600;
    }
}
