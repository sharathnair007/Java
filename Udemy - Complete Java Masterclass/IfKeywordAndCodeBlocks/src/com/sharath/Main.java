package com.sharath;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 6000;
        int levelCompleted = 5;
        int bonus = 100;

        if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score is less than 5000 but it is greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score is less than 1000");
        } else {
            System.out.println("Something else");
        }

        //  Note: variables created outside the code block can be accessed inside any code blocks
        // but the var created inside the code block can't be accessed outside that block.

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }


        // Challenge
        // Print out a second score on the screen with the following:
        // score set to 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well.
        if (gameOver) {
            int secondScore = 10000;
            levelCompleted = 8;
            bonus = 200;
            System.out.println(secondScore);
            int finalScore = secondScore + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }

}