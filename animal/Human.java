package HWs.HW2.animal;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(Pets pet) {
        pet.move(this);
    }
    public void play(Pets pet) {
        say(pet);
        if (pet.isHungry()) {
            feed(pet);
        }else {
            pet.voice();
        }
    }
    private void feed(Pets pet) {
        System.out.println(getName() + " fed " + pet.getName());
        pet.eat();
    }
}
