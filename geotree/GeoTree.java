package HWs.HW2.geotree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public interface GeoTree extends Printer {
    ArrayList<Node> tree = new ArrayList<>();

    void appendParents(Person children);
    void appendGrandparent(Person grandChildren);
    void appendAunt(Person niece);
    void appendSiblings(Person sibling);
    void appendParents_In_Low(Person daughter_in_low);


    default ArrayList<Node> getTree() {
        return tree;
    }

    default void print() throws IOException {
        FileWriter fileWriter = new FileWriter("Research.txt", true);
        for (Node node : getTree()) {
            fileWriter.write(node.toString());
            fileWriter.write('\n');
        }
        fileWriter.write("---");
        fileWriter.write('\n');
        fileWriter.flush();
    }
}
