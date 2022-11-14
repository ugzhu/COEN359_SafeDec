public class AddOneDayDecorator implements Schedule{

    private Schedule decorated;

    public AddOneDayDecorator(Schedule decorated){
        this.decorated = decorated;
    }

    public Schedule getCore(){
        return decorated;
    }
    public long getDuration() {
        return decorated.getDuration() + 24 * 60 * 60;
    }
}
