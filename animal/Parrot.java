package HWs.HW2.animal;

public class Parrot extends Pets implements Flyable{
    public Parrot(String name, boolean hungry) {
        super(name, hungry);
    }


    @Override
    void eat() {
        if (this.isHungry()) {
            this.setHungry(false);
            System.out.println("Parrot " + this.getName() + " ate");
        } else {
            System.out.println("Parrot " + this.getName() + " is not hungry");
        }
    }

    @Override
    public void voice() {
        System.out.println("I'm a talking parrot");
    }

    @Override
    public void move(Human human) {
        fly();
        System.out.println(" to " + human.getName());
    }

    @Override
    public void fly() {
        System.out.print("Parrot " + this.getName() + " is flying");
    }
}
