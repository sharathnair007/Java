package com.sharath;

public class Main {

    public static void main(String[] args) {

        // two data types which are used for numbers with decimal points are floats and doubles.
        // floats have single precision (seven after decimal point).
        // double data types have double precision.(16 after decimal point)
        // doubles are faster on modern computers
        // most of the java in-built functions use doubles as return types
        // doubles are more precise than floats
        // so use doubles than floats

        int myIntValue = 5/2;
        float myFloatValue = 5f/3f;
        double myDoubleValue = 5d/3d;
        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);


        // Exercise:
        // Convert a given number of pounds to kilograms.
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of kilograms for the number above and store in a variable.
        // 3. Print out the result.

        double pounds = 10d;
        double kilograms = (double) (pounds * 0.453592d);
        System.out.println("kilograms = "+ kilograms);


    }
}
