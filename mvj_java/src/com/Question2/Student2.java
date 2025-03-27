package com.Question2;

import java.util.Scanner;
public class Student2 {
	Student2() {
        System.out.println("Student object is created");
    }

	public void getInput() {
		// TODO Auto-generated method stub
		
	}

	public void calcArea() {
		// TODO Auto-generated method stub
		
	}

}
class Commission {
    // Data members
    private String name, address, phone;
    private double salesAmount;

    // Method to accept details of the sales employee
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scanner.nextLine();
        System.out.print("Enter Address: ");
        address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter Sales Amount: ");
        salesAmount = scanner.nextDouble();
    }

    // Method to calculate and display commission
    public void calculateCommission() {
        double commission = 0;
        if (salesAmount >= 100000) {
            commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 0.03;
        }
        System.out.println("Commission for " + name + " is: Rs. " + commission);
    }
}

// Circle class
class Circle {
    // Data members
    private double radius;
    private String colour;

    // Method to accept details of the circle
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        radius = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Colour: ");
        colour = scanner.nextLine();
    }

    // Method to calculate and display the area of the circle
    public void calcArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the " + colour + " circle is: " + area);

	}

}
