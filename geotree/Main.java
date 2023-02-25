package HWs.HW2.geotree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person firstPerson = new Person("Olga", 27);
        Person secondPerson = new Person("Tatiana", 21);
        Person thirdPerson = new Person("Nick", 50);
        Person fourthPerson = new Person("Nadejda", 49);

        Person fifthPerson = new Person("Ivan", 81);
        Person sixthPerson = new Person("Olga_granny", 75);
        Person seventhPerson = new Person("Lidiya", 50);


        thirdPerson.appendParents(firstPerson);
        thirdPerson.appendParents(secondPerson);
        fourthPerson.appendParents(firstPerson);
        fourthPerson.appendParents(secondPerson);
        fifthPerson.appendParents(thirdPerson);
        fifthPerson.appendParents(seventhPerson);
        sixthPerson.appendParents(thirdPerson);
        sixthPerson.appendParents(seventhPerson);
        fifthPerson.appendGrandparent(firstPerson);
        fifthPerson.appendGrandparent(secondPerson);
        sixthPerson.appendGrandparent(firstPerson);
        sixthPerson.appendGrandparent(secondPerson);
        seventhPerson.appendAunt(firstPerson);
        seventhPerson.appendAunt(secondPerson);
        firstPerson.appendSiblings(secondPerson);
        thirdPerson.appendSiblings(seventhPerson);
        fifthPerson.appendParents_In_Low(fourthPerson);
        sixthPerson.appendParents_In_Low(fourthPerson);

        thirdPerson.getChildrenByPerson();
        thirdPerson.getParents(Relationships.CHILD);
        fifthPerson.getGrandchildren();
        firstPerson.getGrandparents(Relationships.GRANDCHILD);
        seventhPerson.getNieceByPerson();
        firstPerson.getAunt(Relationships.NIECE);
        firstPerson.getSiblings(Relationships.SIBLING);
        thirdPerson.getSiblings(Relationships.SIBLING);
        firstPerson.print();
    }

}
