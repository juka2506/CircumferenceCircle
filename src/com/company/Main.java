package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");

        float pi = (float) Math.PI;
        float radius = scanner.nextFloat();

        float circumference = 2 * pi * radius;
        System.out.println("The circumference of the circle is " + circumference);
        
    }
}
