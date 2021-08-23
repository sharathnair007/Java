package com.sharath;

public class Main {

    public static void main(String[] args) {
        // Java treats double quotes as strings
        // For char specifically have to provide single quotes
        char myChar = 'D';

        // char can also take unicode
        // char has a width of 16 (2 bytes)
        char myUnicodeChar = '\u00A9';
        System.out.println("myUnicodeChar = "+ myUnicodeChar);


        // Boolean only has two possible values tru or false
        // Used a lot for conditional logics
        boolean myBoolean = true;


        // Challenge
        // 1. Find the code for registered symbol on the same line as the copyright symbol.
        // 2. Create a variable of type char and assign it the unicode value for that symbol.
        // 3. Display in on screen.

        char registeredSymbol = '\u00AE';
        System.out.println("registeredSymbol = "+registeredSymbol);

    }
}
