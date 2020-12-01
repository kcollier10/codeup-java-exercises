public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
        System.out.print("Hello, ");
        System.out.println("World!");



        int myFavoriteNumber;
        myFavoriteNumber = 10;
        // or
        int myFavoriteNumber2 = 10;

        String myString = "My favorite number is " + myFavoriteNumber;
        // placing 'char' inside will not work; gives error
        // placing 3.14159 inside string value does not work; pi is a 'double'

        System.out.println(myString);

        long myNumber = 123;
        System.out.println(myNumber);
        // declaring myNumber without defining brings error about variable not being initialized
        // assigning 3.14 to the long doesn't work because 3.14 is a double
        // assigning 123L to myNumber outputs 123
        // assigning 123 to myNumber outputs 123

        float myNumber2 = Float.parseFloat("3.14");
        System.out.println(myNumber2);
        // can fix the float issues with integers by using a parseFloat()

        int x = 5;
        System.out.println(x++);
        // 5; x++ displays x, then increments
        System.out.println(x);
        // 6; was set as 5++ in last system print, so now x = 6

        int y = 5;
        System.out.println(++y);
        // 6; ++y increments first, and then displays x
        System.out.println(y);
        // 6

        // String class = "my string";
        // not allowed, unexpected token; has already been used at top of document

        // String theNumberThree = "three";
        // Object o = theNumberThree;
        // int three = (int) o;
        // class String cannot be cast to class Integer

//         int three = (int) "three";
        // another inconvertible type error
        // String cannot be converted to int

        int a = 4;
        a += 5;

        int b = 3;
        int c = 4;
        c *= b;

        int d = 10;
        int e = 2;
        d /= e;
        e -= d;

        byte test = 127;
        System.out.println(test);
        System.out.println(++test);

        // if higher than 127, starts back at -128

        short test2 = 32767;
        System.out.println(test2);
        System.out.println(++test2);

        byte test3 = -128;
        test3 -= 1;
        System.out.println(test3);
        System.out.println(++test3);


        int test4 = Integer.MAX_VALUE;
        System.out.println(++test4);
        // adding one to the MAX_VALUE will take the MAX of int down to the MIN

        int myInteger = 900;
        double morePrecise = myInteger;
        System.out.println(morePrecise);
        // added a decimal point

        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(almostPi);
        // parse'd the 3.14159


    }
}
