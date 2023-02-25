package HWs.HW2.geotree;

public class Node {
    Person person;
    Relationships relationships;
    Person anotherPerson;

    public Node(Person person, Relationships relationships, Person anotherPerson) {
        this.person = person;
        this.relationships = relationships;
        this.anotherPerson = anotherPerson;
    }

    @Override
    public String toString() {
        return String.format("<%s %s %s>", person, relationships, anotherPerson);
    }
}
