package HWs.HW2.animal;

public abstract class Pets implements Actions{
   private String name;
   private boolean hungry;

    public Pets(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    abstract void eat();
}
