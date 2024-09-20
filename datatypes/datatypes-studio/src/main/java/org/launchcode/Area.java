package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");
        Double enteredRadius = input.nextDouble();


//        Double area = 3.14 * enteredRadius * enteredRadius;

        System.out.println("The area of a circle of radius " + enteredRadius + " is: " + Circle.getArea(enteredRadius));
    }
}
