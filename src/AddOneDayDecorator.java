public class AddOneDayDecorator implements Schedule{

    private Schedule decorated;

    public AddOneDayDecorator(Schedule decorated){
        this.decorated = decorated;
    }

    public Schedule getCore(){
        return decorated.getCore();
    }

    // add core's duration one time for each decorator
    // to represent one more day of monitoring
    public long getDuration() {
        return decorated.getDuration() + getCore().getDuration();
    }
}
