package com.LickingHeights;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//testOddness();
		//keepContained();
		lastDigit();

	}

	public static void testOddness() {
     Scanner testOddness;
     testOddness = new Scanner(System.in);

     System.out.println("Give me a positive number");
     int number = testOddness.nextInt();

          System.out.println(number + " is odd: " + (number%2 != 0));




	}
    public static void keepContained(){
	    int number;
	    Scanner keyboard;
	    keyboard = new Scanner(System.in);
        System.out.println("Give me a positive number");
        number = keyboard.nextInt();

        System.out.println( " The number contained is: ");
        System.out.println((number%8)+ 5);


    }
    public static void lastDigit(){
	    int number;
	    Scanner keyboard;
	    keyboard = new Scanner(System.in);
	    System.out.println("Give me a four places long number ");
	    number = keyboard.nextInt();

	    System.out.println(" The last digit of number is: " + (number%10));

    }
}

