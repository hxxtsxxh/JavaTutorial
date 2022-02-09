package com.company;

//class Main (always start class with uppercase letter)
public class Main {
    // main() method is always required
    public static void main(String[] args) {
        System.out.println("Hello World");

        // VARIABLES
            // syntax: type variableName = value;
        String name = "John";
        int myNum = 15;
        boolean isHappy = true;
        System.out.println(name);
        System.out.println(myNum);
        System.out.println(isHappy);
            // we can also declare a variable without assigning the value, and assign the value later
        int num;
        num = 17;
        System.out.println(num);
            // final variables: used to make unmodifiable values (read only)
        final String myName = "Bob";
        //myName = "heet"; --> causes error

        // DATA TYPES
            // Primitive data types - includes [byte, short, int, long, float, double, boolean, and char]
            // Non-primitive data types - String, Arrays, Classes, etc.
        // Primitive:

            /* byte 	1 byte 	Stores whole numbers from -128 to 127
               short 	2 bytes Stores whole numbers from -32,768 to 32,767
               int 	    4 bytes Stores whole numbers from -2,147,483,648 to 2,147,483,647
               long 	8 bytes Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
               float 	4 bytes Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
               double 	8 bytes Stores fractional numbers. Sufficient for storing 15 decimal digits
               boolean 	1 bit 	Stores true or false values
               char 	2 bytes Stores a single character/letter or ASCII values
            */

        // CASTING
        int revenue = 50;
        double myRevenue = (double) revenue; // manual casting: int to double

        int hisRevenue = 50;
        double herRevenue = hisRevenue; // automatic casting: int to double

        System.out.println(revenue);
        System.out.println(myRevenue);
        System.out.println(hisRevenue);
        System.out.println(herRevenue);

        // OPERATORS
            // used to perform operations on vars and vals
        int x = 100 + 50; // adding two ints
        int y = x + 200; // adding var and int
        System.out.println(y);

        // STRINGS
            // a String variable contains a collection of characters surrounded by double quotes
        String greeting = "Hello";
        System.out.println("The length of the greeting string is: " + greeting.length()); // depicts length of 'greeting'
        System.out.println(greeting.toUpperCase()); // makes greeting all uppercase
        System.out.println(greeting.toLowerCase()); // makes greeting all lowercase
        System.out.println(greeting.indexOf("lo")); // returns the index of the first occurrence of a specific text
        System.out.println(greeting + " Heet"); // combines two strings (concatenation)
        System.out.println(greeting.concat(" Heet")); // can also use the concat() method to concatenate two strings

        greeting = "Hey there \'Bobby\'"; // the \' results in a single quote inside a string
        System.out.println(greeting); // would print out Hey there 'Bobby'

        String a = "10";
        int b = 30;
        String c = a + b;
        System.out.println(c); // c will be 1030 (a String)

        // MATH
            // Java Math class has many methods that allows you to perform mathematical tasks on numbers
        System.out.println(Math.max(5, 10)); // Math.max(x, y) method can be used to find the highest num of two
        System.out.println(Math.min(5, 10)); // Math.min(x, y) method can be used to find the lowest num of two
        System.out.println(Math.sqrt(64)); // returns the square root of 64
        System.out.println(Math.abs(-4.7)); // returns the absolute value of a number
        System.out.println(Math.random()); // returns a number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random() * 101); // returns random num from 0 to 100

        // CONDITIONAL STATEMENTS
            // if-else
        if (20 > 10){
            System.out.println("20 is greater than 10");
        }

        if (10 > 20) {
            System.out.println("10 is greater than 20");
        }
        else{
            System.out.println("20 is greater than 10");
        }

            // Short Hand If...Else (Ternary Operator)
                // syntax: variable = (condition) ? expressionTrue : expressionFalse
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // SWITCH
            // Switch Statements
        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            } // outputs "Thursday" (day 4)

            // Default Keyword
        int theDay = 4;
        switch (theDay) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
            } // Outputs "Looking forward to the Weekend"


        // LOOPS
            // While Loop
        x = 0;
        while(x < 10){
            System.out.println(x);
            x++;
        }

            // Do/While Loop
        do {
            System.out.println(x);
            x++;
        }
        while (x < 10);

            // For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int i = 0; i <= 10; i = i+2) {
            System.out.println(i);
        }

            // Enhanced For Loop
        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String car : cars) { // read as 'for each car in cars, print car'
            System.out.println(car);
        }

        // BREAK AND CONTINUE
            // break used to jump out of a loop
            // continue breaks one iteration (in the loop), and cont. with the next iteration in the loop

        // ARRAYS
            // used to store multiple vals in a single var, instead of declaring sep. vars for each val

        String[] vehicles = {"car", "truck"};
        int[] nums = {5, 6, 7, 9};
        System.out.println(vehicles[0]); // outputs car

        nums[0] = 4; // changes 5 to a 4

        System.out.println(nums.length); // outputs 4

            // Multidimensional Arrays
        int[][] myNumbers = {{1,2,3,4}, {1,2,3}}; // array with two arrays as its elements
        int n = myNumbers[1][2];
        System.out.println(n); // outputs 3







        }
}
