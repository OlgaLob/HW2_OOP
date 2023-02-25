package HWs.HW2.animal;

public class Fish extends Pets implements Swimable {
    public Fish(String name, boolean hungry) {
        super(name, hungry);
    }

    @Override
    void eat() {
        if (this.isHungry()) {
            this.setHungry(false);
            System.out.println("Fish " + this.getName() + " ate");
        } else {
            System.out.println("Fish " + this.getName() + " is not hungry");
        }
    }


    @Override
    public void voice() {
        System.out.println("Glug - glug");
    }

    @Override
    public void move(Human human) {
        swim();
        System.out.println(" to " + human.getName());
    }
    @Override
    public void swim() {
        System.out.print("Fish " + this.getName() + " is swimming");
    }
}
