public class FooBar {

    public static void main(String[] args)
    {
        int p;  // p is an uninitialized local variable here

        boolean myBoolean = true;

        // If/Else statement satisfies compiler's full initialization check
        if (myBoolean) {
            p = 1;
        } else {
            p = 2;
        }

        System.out.println("p is " + p);  // p is now fully initialized

        int q; //q is uninitialized local variable here
        // if statement with static boolean value satisfied compiler
        //full initialized check
        if (true){
            q = 1;
        }

        System.out.println("p is " + p);  // q is now fully initialized

        // switch statement with a default block satisfies compiler's full initialization check

        int testInt = 5;  // test variable for switch statement.
        int r;  // r is an uninitialized local variable here
        switch (testInt) {
            case 0:
            case 1:
            case 2:
                r = 1;
                break;
            case 3:
            case 4:
            case 5:
                r = 2;
                break;
            default:
                r = 3;
        }
        System.out.println("r is " + r);   // r is now fully initialized
        //Do while loop
        int s , t =0;
        do {
            s = t++;
        }while (t<1);
        System.out.println("s = " + s);

        //while loop
        int u  , v =0;
        while (true)
        {
            u = v++;
            break;
        }
        System.out.println("u = " + u);
    }

}
