package HWs.HW2.geotree;


import java.io.IOException;
import java.util.ArrayList;

class Person implements GeoTree, Research, Printer {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public void appendParents(Person children) {
        getTree().add(new Node(this, Relationships.PARENT, children));
        getTree().add(new Node(children, Relationships.CHILD, this));
    }

    @Override
    public ArrayList<Person> getParents(Relationships relationships) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.CHILD)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<Person> getChildrenByPerson() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.PARENT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public void appendGrandparent(Person grandChildren) {
        getTree().add(new Node(this, Relationships.GRANDPARENT, grandChildren));
        getTree().add(new Node(grandChildren, Relationships.GRANDCHILD, this));
    }

    @Override
    public ArrayList<Person> getGrandparents(Relationships relationships) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.GRANDCHILD)) {
                result.add(node.anotherPerson);
            }
            result.add(node.anotherPerson);
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<Person> getGrandchildren() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.GRANDPARENT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public void appendAunt(Person niece) {
        getTree().add(new Node(this, Relationships.AUNT, niece));
        getTree().add(new Node(niece, Relationships.NIECE, this));
    }

    @Override
    public ArrayList<Person> getAunt(Relationships relationships) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.NIECE)) {
                result.add(node.anotherPerson);
            }
            result.add(node.anotherPerson);
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<Person> getNieceByPerson() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.AUNT)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public void appendSiblings(Person sibling) {
        getTree().add(new Node(this, Relationships.SIBLING, sibling));
    }

    @Override
    public ArrayList<Person> getSiblings(Relationships relationships) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.SIBLING)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public void appendParents_In_Low(Person daughter_in_low) {
        getTree().add(new Node(this, Relationships.PARENT_IN_LAW, daughter_in_low));
        getTree().add(new Node(daughter_in_low, Relationships.DAUGHTER_IN_LOW, this));
    }

    @Override
    public ArrayList<Person> getParents_In_Low(Relationships relationships) throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) && node.relationships.equals(Relationships.DAUGHTER_IN_LOW)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }

    @Override
    public ArrayList<Person> getDaughter_In_Low() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Node node : getTree()) {
            if (node.person.getName().equals(this.getName()) &&
                    node.relationships.equals(Relationships.PARENT_IN_LAW)) {
                result.add(node.anotherPerson);
            }
        }
        print(result);
        return result;
    }
}
