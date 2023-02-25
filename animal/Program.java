package HWs.HW2.animal;

public class Program {
    public static void main(String[] args) {
        Human human = new Human("Nick");
        Cat cat = new Cat("Vasya", true);
        Fish fish = new Fish("Jarry", false);
        Parrot parrot = new Parrot("Captain", true);

        human.play(cat);
        human.play(fish);
        human.play(parrot);
    }
}
