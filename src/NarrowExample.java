/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 3: Working with Java Primitive Data Types and String APIs
Topic: Declare and Initialize Variables
Sub-Topic: Narrowing
*/

public class NarrowExample {

    public static void main(String[] args) {

        // First lets print out some ranges:
        System.out.println("A byte has a range of " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);

        // We'll show character ranges both as unicode ranges and int ranges
        System.out.println("A char has a range of " + String.format("\\u%04x  to \\u%04x", (int) Character.MIN_VALUE, (int) Character.MAX_VALUE));
        System.out.println("A char has a range of " + (int) Character.MIN_VALUE + "  to " + (int) Character.MAX_VALUE);
        System.out.println("A short has a range of " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("An int has a range of " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("A long has a range of " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("A float has a range of " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("A double has a range of " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);

        //we will set each variable to its maxim values
        byte b = 127;
        char c = 65535;
        short s = 32767;
        //it will not give error

        //But if i will increase their values then it will give error
//        byte b1 = 128;
//        char c1 = 65536;
//        short s1 = 32768;

        //if i will put 0.0 it is also error because it is double value always
//        byte b1 = 0.0;
//        char c1 = 0.0;
//        short s1 = 0.0;
//        int i = 0.0;
//        float f = 0.0;
//        //No error in double
//        double d = 0.0;


    }
}