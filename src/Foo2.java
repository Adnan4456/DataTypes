

public class Foo2 {


    public static void main(String[] args){

        //You can set all of the numeric primitive data variables to literal number
        //from to 127

        byte b = 127;
        char c = 127;
        short s =127;
        int i = 127;
        long l = 127;
        float f= 127;
        double d= 127;


        //boolean can only set to true or false
        boolean isTrue = false;

        System.out.println("b = "+b);
        System.out.println("c = "+c);
        System.out.println("s = "+s);
        System.out.println("i = "+i);
        System.out.println("l = "+l);
        System.out.println("f = "+f);
        System.out.println("d = "+d);
        System.out.println("isTrue = "+isTrue);

        long l2 = 127l;
        long l3 = 127L;
        System.out.println("l2 = " + l2);
        System.out.println("L3 = " + l3);

        float f2 = 127f;
        float f3 = 127F;
        System.out.println("f2 = " + f2);
        System.out.println("F3 = " + f3);

        double d2= 127d;
        double d3 = 127D;

        System.out.println("d2 = " + d2);
        System.out.println("D3 = " + d3);

    }

}
