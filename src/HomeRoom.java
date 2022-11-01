public class HomeRoom implements Room{
    private int id;
    private Service fire = null;
    private Service security = null;
    private boolean camera = false;

    public HomeRoom(int id){
        this.id = id;
    }

    public void addFireService(Service s) {
        this.fire = s;
    }


    public void addSecurityService(Service s) {
        this.security = s;
    }


    public void addCamera() {
        this.camera = true;
    }

    public int getId(){
        return this.id;
    }


    public boolean hasFireService() {
        return this.fire != null;
    }


    public boolean hasSecurityService() {
        return this.security != null;
    }


    public boolean hasCamera() {
        return camera;
    }


}
