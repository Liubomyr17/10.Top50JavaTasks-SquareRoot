package com.company;

import java.util.*;

/**
 * Java program to find the square root of a number in Java
 * This Java program example demonstrates using Math class
 * sqrt() method to get the square root of a number of Java
 * */

public class SquareRoot {
    public static void main(String []args) {
        //Used to get input number for which square root to find
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find square root in Java: ");
        //Getting input number from user to calculate square root
        double square = scanner.nextDouble();
        //Getting the square root of a number of Java
        double squareRoot = Math.sqrt(square);
        //Printing number and its square root in Java
        System.out.printf("Square root of number %f is: %f %n", square, squareRoot);
                }

    }
