package HWs.HW2.geotree;

import java.io.IOException;
import java.util.ArrayList;

public interface Research {
    ArrayList<Person> getParents(Relationships relationships) throws IOException;
    ArrayList<Person> getChildrenByPerson() throws IOException;

    ArrayList<Person> getGrandchildren() throws IOException;

    ArrayList<Person> getGrandparents(Relationships relationships) throws IOException;

    ArrayList<Person> getAunt(Relationships relationships) throws IOException;
    ArrayList<Person> getNieceByPerson() throws IOException;
    ArrayList<Person> getSiblings(Relationships relationships) throws IOException;

    ArrayList<Person> getParents_In_Low(Relationships relationships) throws IOException;
    ArrayList<Person> getDaughter_In_Low() throws IOException;
}
