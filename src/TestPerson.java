/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Identify the Scope of a variable
*/
import static java.lang.System.out;

public class TestPerson {
    public static void main(String[] args) {

        // First we'll create a person, JOE using 2 args constructor.
        Person joe = new Person("JOE", "55");

        // Next we'll create a person, using 1 arguments
        Person deb = new Person("DEB", "85");

        // And now the noargs constructor, and using setters
        Person ann = new Person();
        ann.setAge("21");
        ann.setInstanceName("ANN");

        out.println(joe);
        out.println(deb);
        out.println(ann);
    }
}