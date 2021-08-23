package com.sharath;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);

        // shortcut for incrementing aa variable by 1
        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        // result = result + 2

        result += 5;
        System.out.println("Result is now " + result);
        result *= 5;
        System.out.println("Result is now " + result);
        result /= 5;
        System.out.println("Result is now " + result);
        result -= 5;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 90;
        if (topScore == 100)
            System.out.println("You got full marks, congrats!!");
        if (topScore >= 35)
            System.out.println("You have passed the assessment!!");
        if (topScore <= 34)
            System.out.println("You have failed the assessment :(");

        // when using multiple conditions using the AND(&&) operator make sure to use brackets
        // which make it much cleaner.
        if ((topScore >= 75) && (topScore <= 100))
            System.out.println("You have above average marks.");


        if ((topScore == 90) || (topScore == 80))
            System.out.println("The score is either 80 or 90.");

        // Note: While making a comparison using the == operator
        //      if the check is between a int it will give an error.
        // but if it is checking a boolean it won't. as shown in the below examples.

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if (isCar = true)
            // this above line is running without error is because it is of type boolean.
            System.out.println("This is not supposed to happen");

        // Ternary Operators
        boolean wasCar = isCar ? true : false;


        // Challenge
        // 1. Create a double variable with the value 20
        double myDouble = 20;
        // 2. Create a second variable of type double with value 80
        double mySecondDouble = 80;
        // 3. Add both numbers up and multiply by 25
        double myNewDouble = (myDouble + mySecondDouble) * 25;
        System.out.println(myNewDouble);
        // 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40.
        double myRemainder = myNewDouble % 40;
        System.out.println(myRemainder);
        // 5. Write an "if"  statement that displays a message "Total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less.

        if (myRemainder <= 20)
            System.out.println("Total was over the limit");



//        References: Operator Precedence: http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
//                    Summary of Operators: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
//                    Java Basics: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html




    }
}
