public interface Room {
    public void addFireService(Service s);
    public void addSecurityService(Service s);
    public void addCamera();

    public int getId();
    public boolean hasFireService();
    public boolean hasSecurityService();
    public boolean hasCamera();
}
