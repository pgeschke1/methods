package com.paulgeschke;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menuSelection;
        do {
            System.out.println("Select a Shape:");
            System.out.println("1. Square");
            System.out.println("2. Triangle");
            System.out.println("3. Circle");
            System.out.println("4. Rectangle");
            menuSelection = input.nextInt();
            if (menuSelection < 1 || menuSelection > 4) {
                System.out.println("Please enter a valid selection: ");
            }
        }while (menuSelection != 1 && menuSelection != 2 && menuSelection != 3 && menuSelection != 4);
        switch (menuSelection){
            case 1:
                square();
            case 2:
                triangle();
            case 3:
                circle();
            case 4:
                rectangle();
        }
    }
    private static String getInput(String prompt){
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    private static void square() {
        String s1 = getInput("Enter side length: ");
        squareCalc(s1);
        double result = squareCalc(s1);
        System.out.println("The square's area is " + result + " square units.");
    }
    private static double squareCalc(String s1){
        double d1 = Double.parseDouble(s1);
        double result = d1 * d1;
        return result;
    }
    private static void triangle() {
        String s1 = getInput("Enter Base length: ");
        String s2 = getInput("Enter height length: ");
        triangleCalc(s1, s2);
        double result = triangleCalc(s1, s2);
        System.out.println("The triangle's area is " + result + " square units.");
    }
    private static double triangleCalc(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = (d1 * d2) / 2;
        return result;
    }
    private static void circle() {
        String s1 = getInput("Enter radius length: ");
        circleCalc(s1);
        double result = circleCalc(s1);
        System.out.println("The circle's area is " + result + " square units.");
    }
    private static double circleCalc(String s1){
        double d1 = Double.parseDouble(s1);
        double result = (d1 *d1) * 3.14;
        return result;
    }
    private static void rectangle() {
        String s1 = getInput("Enter Base length: ");
        String s2 = getInput("Enter height length: ");
        rectangleCalc(s1, s2);
        double result = rectangleCalc(s1, s2);
        System.out.println("The rectangle's area is " + result + " square units.");
    }
    private static double rectangleCalc(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = (d1 * d2);
        return result;
    }

}
