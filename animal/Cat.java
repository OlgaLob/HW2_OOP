package HWs.HW2.animal;

public class Cat extends Pets {

    public Cat(String name, boolean hungry) {
        super(name, hungry);
    }

    @Override
    public void voice() {
        System.out.println("Meow-meow");
    }

    @Override
    public void move(Human human) {
        System.out.println("Cat " + this.getName() + " is going to " + human.getName());
    }

    @Override
    void eat() {
        if (this.isHungry()) {
            this.setHungry(false);
            System.out.println("Kitty " + this.getName() + " ate");
        } else {
            System.out.println("Kitty " + this.getName() + " is not hungry");
        }
    }
}
