package com.Question2;
import java.util.Scanner;

class Circle {
    
    private double radius;
    private String color;

    
    public void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
        
        scanner.nextLine(); // Consume the newline character
        
        System.out.print("Enter the color of the circle: ");
        this.color = scanner.nextLine();
    }

    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the " + color + " circle with radius " + radius + " is: " + area);
    }
}
