public interface Room {
    public void addFireService(Service s);
    public void addSecurityService(Service s);
    public void addCamera();
    public void addSchedule(Schedule schedule);

    public int getId();
    public boolean hasFireService();
    public boolean hasSecurityService();
    public boolean hasCamera();
    public Schedule getSchedule();
}
