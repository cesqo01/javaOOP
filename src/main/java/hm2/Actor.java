package hm2;

public abstract class Actor implements ActorBehavior {
    protected String name;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;

    protected boolean makeOrder;
    protected boolean takeOrder;

    public Actor(String name) {
        this.name = name;
        this.status = "In Market";
        makeOrder = false;
        takeOrder = false;
    }

    public String getName() {
        return name;
    }

}
