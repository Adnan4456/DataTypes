
public class WideningExample {

    public static void main(String[] args)
    {
        char c= 'a'; //this is integer value 97

        byte myByte  = 0; // remember this  is narrowing. 0  is an int  narrowed to a byte.
        short myshort;

        //Exact literal type assignment

        int myInt = 0;
        float f = 0.0f;
        double d = 0.0;
        long l = 0;


        //widening with literal
        long myLong = 0; // widening an int to a long
        d = 0.0f; //widening an float to a double

        d = f = l = myInt = myshort =  myByte;

        System.out.println("Happy widening ");

    //We will not get any error
    //But in case of char
//    byte b = 'a';
//    c = b;

    }

}
