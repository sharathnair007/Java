package com.sharath;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println(myString);

        // appending to a string
        myString = myString + ", and this is more.";
        System.out.println(myString);

        // If we do calculations between a int/short/byte/double and a string it gets converted to a string.
        String myLastString = "10";
        int myInt = 50;
        myLastString = myLastString + myInt;
        System.out.println(myLastString);
    }
}
