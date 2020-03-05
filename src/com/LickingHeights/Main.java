package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
		testOddness();
	}
	public static void testOddness() {
     Scanner testOddness;
     testOddness = new Scanner(System.in);

     System.out.println("Give me a positive number");


     int number = testOddness.nextInt();

          System.out.println(number + " is odd: "  +(number % 2 !=0 ));



	}
}
