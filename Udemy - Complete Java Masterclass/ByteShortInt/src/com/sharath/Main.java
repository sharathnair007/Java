package com.sharath;

public class Main {

    public static void main(String[] args) {
	    // Integer contains -2.147 billion to 2.147 Billion values.
        int myMinValue = -2_14_74_83_648;
        int myMaxValue = 2_14_74_83_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = "+ myTotal);

        // byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue = "+ myNewByteValue);

        // short has a width of 16
        short myShortValue = 32767;
        short myNewShortValue = (short) (myShortValue/2);
        System.out.println("myNewShortValue = "+ myNewShortValue);

        // long has a width of 64
        long myLongValue = 92_23_37_20_36_85_47_75_807L;

        // Exercise:
        // 1. Create a byte variable and set it to any valid byte number.
        byte myByte = 12;

        // 2. Create a short variable and set it to any valid short number.
        short myShort = 3000;

        // 3. Create an int variable and set it to any valid int number.
        int myInt = 3000000;

        // 4. Create a variable of type long, and make it equal to 50000 + 10 times
        // the sum of the byte, plus the int.

        long myLong = 50000L + 10 * (myByte + myShort + myInt);
        System.out.println("myLong = " +myLong);



    }
}
