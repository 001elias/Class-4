package MyProgram;

import java.util.Scanner;

public class MyProgram {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        if (number > 0) {
	            System.out.println("The number is positive");
	        } else if (number < 0) {
	            System.out.println("The number is negative");
	        } else {
	            System.out.println("The number is zero");
	        }
	        System.out.println("");
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        System.out.print("Enter the third number: ");
	        int num3 = scanner.nextInt();
	        System.out.print("Enter the fourth number: ");
	        int num4 = scanner.nextInt();
	        int greatest = num1;
	        if (num2 > greatest) {
	            greatest = num2;
	        }
	        if (num3 > greatest) {
	            greatest = num3;
	        }
	        if (num4 > greatest) {
	            greatest = num4;
	        }
	        System.out.println("The greatest number is: " + greatest);
	        System.out.println("");
	        
	        double carrotsPrice = 2.0;
	        double onionsPrice = 4.0;
	        double meatPrice = 10.0;	       
	        
	        System.out.print("Enter the quantity of Carrots (in lbs): ");
	        double carrotsQuantity = scanner.nextDouble();
	        System.out.print("Enter the quantity of Onions (in lbs): ");
	        double onionsQuantity = scanner.nextDouble();
	        System.out.print("Enter the quantity of Meat (in lbs): ");
	        double meatQuantity = scanner.nextDouble();	     
	        double subtotal = (carrotsPrice * carrotsQuantity) + (onionsPrice * onionsQuantity) + (meatPrice * meatQuantity);	      
	        System.out.print("Enter the payment method (cash or card): ");
	        String paymentMethod = scanner.next();	        
	        if (paymentMethod.equalsIgnoreCase("card")) {
	            subtotal *= 1.13; 
	        }	       
	        System.out.println("Total amount to be paid: $" + subtotal);
	        System.out.println("");
	        

	        System.out.print("Enter a number: ");
	        int number1 = scanner.nextInt();

	        if (number1 % 5 == 0 && number1 % 11 == 0) {
	            System.out.println("The number is divisible by both 5 and 11");
	        } else {
	            System.out.println("The number is not divisible by both 5 and 11");
	        }
	        System.out.println("");
	        

	        System.out.print("Enter a number: ");
	        int number11 = scanner.nextInt();

	        if (number11 % 2 == 0) {
	            System.out.println("The number is even");
	        } else {
	            System.out.println("The number is odd");
	        }
	        System.out.println("");
	        
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        boolean isLeapYear = false;

	        if (year % 4 == 0) {
	            if (year % 100 == 0) {
	                if (year % 400 == 0) {
	                    isLeapYear = true;
	                }
	            } else {
	                isLeapYear = true;
	            }
	        }

	        if (isLeapYear) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	        
	        System.out.println("");
	        
	        System.out.print("Enter the week number (1-7): ");
	        int weekNumber = scanner.nextInt();

	        String weekDay;

	        switch (weekNumber) {
	            case 1:
	                weekDay = "Monday";
	                break;
	            case 2:
	                weekDay = "Tuesday";
	                break;
	            case 3:
	                weekDay = "Wednesday";
	                break;
	            case 4:
	                weekDay = "Thursday";
	                break;
	            case 5:
	                weekDay = "Friday";
	                break;
	            case 6:
	                weekDay = "Saturday";
	                break;
	            case 7:
	                weekDay = "Sunday";
	                break;
	            default:
	                weekDay = "Invalid week number";
	                break;
	        }

	        System.out.println("The corresponding week day is: " + weekDay);
	        System.out.println("");
	        
	        System.out.print("Enter the month number (1-12): ");
	        int monthNumber = scanner.nextInt();

	        String monthName;

	        switch (monthNumber) {
	            case 1:
	                monthName = "January";
	                break;
	            case 2:
	                monthName = "February";
	                break;
	            case 3:
	                monthName = "March";
	                break;
	            case 4:
	                monthName = "April";
	                break;
	            case 5:
	                monthName = "May";
	                break;
	            case 6:
	                monthName = "June";
	                break;
	            case 7:
	                monthName = "July";
	                break;
	            case 8:
	                monthName = "August";
	                break;
	            case 9:
	                monthName = "September";
	                break;
	            case 10:
	                monthName = "October";
	                break;
	            case 11:
	                monthName = "November";
	                break;
	            case 12:
	                monthName = "December";
	                break;
	            default:
	                monthName = "Invalid month number";
	                break;
	        }

	        System.out.println("The corresponding month name is: " + monthName);
	        System.out.println("");
	        
	        System.out.print("Enter the amount: ");
	        int amount = scanner.nextInt();

	        int noteCount = 0;

	        
	        if (amount >= 2000) {
	            noteCount += amount / 2000;
	            amount %= 2000;
	        }

	        if (amount >= 500) {
	            noteCount += amount / 500;
	            amount %= 500;
	        }

	        if (amount >= 200) {
	            noteCount += amount / 200;
	            amount %= 200;
	        }

	        if (amount >= 100) {
	            noteCount += amount / 100;
	            amount %= 100;
	        }

	        if (amount >= 50) {
	            noteCount += amount / 50;
	            amount %= 50;
	        }

	        if (amount >= 20) {
	            noteCount += amount / 20;
	            amount %= 20;
	        }

	        if (amount >= 10) {
	            noteCount += amount / 10;
	            amount %= 10;
	        }

	        if (amount >= 5) {
	            noteCount += amount / 5;
	            amount %= 5;
	        }

	        if (amount >= 1) {
	            noteCount += amount;
	        }

	        System.out.println("Total number of notes: " + noteCount);
	        System.out.println("");
	        
	        System.out.print("Enter the first angle: ");
	        int angle1 = scanner.nextInt();

	        System.out.print("Enter the second angle: ");
	        int angle2 = scanner.nextInt();

	        System.out.print("Enter the third angle: ");
	        int angle3 = scanner.nextInt();

	       
	        boolean isValidTriangle = (angle1 + angle2 + angle3) == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0;

	        if (isValidTriangle) {
	            System.out.println("The triangle is valid.");
	        } else {
	            System.out.println("The triangle is not valid.");
	        }
	        System.out.println("");
	        
	        System.out.print("Enter the length of side 1: ");
	        double side1 = scanner.nextDouble();

	        System.out.print("Enter the length of side 2: ");
	        double side2 = scanner.nextDouble();

	        System.out.print("Enter the length of side 3: ");
	        double side3 = scanner.nextDouble();

	        
	        boolean isValidTriangle1 = (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);

	        if (isValidTriangle1) {
	            System.out.println("The triangle is valid.");
	        } else {
	            System.out.println("The triangle is not valid.");
	        }
	        System.out.println("");
	        
	        System.out.print("Enter the length of side 1: ");
	        double side11 = scanner.nextDouble();

	        System.out.print("Enter the length of side 2: ");
	        double side21 = scanner.nextDouble();

	        System.out.print("Enter the length of side 3: ");
	        double side31 = scanner.nextDouble();

	        if (side11 == side21 && side21 == side31) {
	            System.out.println("The triangle is an equilateral triangle.");
	        } else if (side11 == side21 || side11 == side31 || side21 == side31) {
	            System.out.println("The triangle is an isosceles triangle.");
	        } else {
	            System.out.println("The triangle is a scalene triangle.");
	        }
	        System.out.println("");
	        
	        System.out.print("Enter the coefficient of x^2: ");
	        double a = scanner.nextDouble();

	        System.out.print("Enter the coefficient of x: ");
	        double b = scanner.nextDouble();

	        System.out.print("Enter the constant term: ");
	        double c = scanner.nextDouble();

	        double discriminant = b * b - 4 * a * c;

	        if (discriminant > 0) {
	            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Root 1: " + root1);
	            System.out.println("Root 2: " + root2);
	        } else if (discriminant == 0) {
	            double root = -b / (2 * a);
	            System.out.println("Root: " + root);
	        } else {
	            System.out.println("The quadratic equation has no real roots.");
	        }
	        System.out.println("");
	        

	        System.out.print("Enter the cost price: ");
	        double costPrice = scanner.nextDouble();

	        System.out.print("Enter the selling price: ");
	        double sellingPrice = scanner.nextDouble();

	        double profitPercentage = ((sellingPrice - costPrice) / costPrice) * 100;

	        if (profitPercentage > 0) {
	            System.out.println("Profit: " + profitPercentage + "%");
	        } else if (profitPercentage < 0) {
	            System.out.println("Loss: " + (-profitPercentage) + "%");
	        } else {
	            System.out.println("No profit or loss.");
	        }
	        System.out.println("");
	        
	        System.out.print("Enter the marks obtained in Physics: ");
	        int physicsMarks = scanner.nextInt();

	        System.out.print("Enter the marks obtained in Chemistry: ");
	        int chemistryMarks = scanner.nextInt();

	        System.out.print("Enter the marks obtained in Biology: ");
	        int biologyMarks = scanner.nextInt();

	        System.out.print("Enter the marks obtained in Mathematics: ");
	        int mathematicsMarks = scanner.nextInt();

	        System.out.print("Enter the marks obtained in Computer: ");
	        int computerMarks = scanner.nextInt();

	        int totalMarks = physicsMarks + chemistryMarks + biologyMarks + mathematicsMarks + computerMarks;
	        double percentage = (totalMarks / 500.0) * 100;

	        String grade;

	        if (percentage >= 90) {
	            grade = "A";
	        } else if (percentage >= 80) {
	            grade = "B";
	        } else if (percentage >= 70) {
	            grade = "C";
	        } else if (percentage >= 60) {
	            grade = "D";
	        } else if (percentage >= 40) {
	            grade = "E";
	        } else {
	            grade = "F";
	        }

	        switch (grade) {
	            case "A":
	                System.out.println("Excellent! You scored grade A.");
	                break;
	            case "B":
	                System.out.println("Well done! You scored grade B.");
	                break;
	            case "C":
	                System.out.println("Good! You scored grade C.");
	                break;
	            case "D":
	                System.out.println("Keep it up! You scored grade D.");
	                break;
	            case "E":
	                System.out.println("You passed! You scored grade E.");
	                break;
	            case "F":
	                System.out.println("Sorry, you failed. You scored grade F.");
	                break;
	            default:
	                System.out.println("Invalid grade.");
	                break;
	        }
	        System.out.println("");
	        
	        System.out.print("Enter the basic salary: ");
	        double basicSalary = scanner.nextDouble();

	        double hra, da;

	        if (basicSalary <= 10000) {
	            hra = 0.2 * basicSalary;
	            da = 0.8 * basicSalary;
	        } else if (basicSalary <= 20000) {
	            hra = 0.25 * basicSalary;
	            da = 0.9 * basicSalary;
	        } else {
	            hra = 0.3 * basicSalary;
	            da = 0.95 * basicSalary;
	        }

	        double grossSalary = basicSalary + hra + da;

	        System.out.println("Gross Salary: " + grossSalary);
	        System.out.println("");
	        
	        System.out.print("Enter the electricity units consumed: ");
	        int units = scanner.nextInt();

	        double bill = 0.0;

	        if (units <= 50) {
	            bill = units * 0.50;
	        } else if (units <= 200) {
	            bill = 50 * 0.50 + (units - 50) * 0.75;
	        } else if (units <= 450) {
	            bill = 50 * 0.50 + 150 * 0.75 + (units - 200) * 1.20;
	        } else {
	            bill = 50 * 0.50 + 150 * 0.75 + 250 * 1.20 + (units - 450) * 1.50;
	        }

	        double surcharge = 0.20 * bill;
	        double totalBill = bill + surcharge;

	        System.out.println("Electricity Bill: Rs. " + totalBill);
	        System.out.println("");
	        

	        System.out.print("Enter the quantity purchased: ");
	        int quantity = scanner.nextInt();

	        System.out.print("Enter the price per item: ");
	        double pricePerItem = scanner.nextDouble();

	        double totalExpenses = quantity * pricePerItem;

	        if (quantity > 100) {
	            totalExpenses *= 0.9; 
	        }

	        System.out.println("Total Expenses: " + totalExpenses);
	        System.out.println("");
	        

	        System.out.print("Enter the current year: ");
	        int currentYear = scanner.nextInt();

	        System.out.print("Enter the year of joining: ");
	        int yearOfJoining = scanner.nextInt();

	        int yearsOfService = currentYear - yearOfJoining;

	        if (yearsOfService > 3) {
	            int bonus = 2500;
	            System.out.println("Congratulations! You are eligible for a bonus of Rs. " + bonus);
	        } else {
	            System.out.println("No bonus eligible.");
	        }
	        System.out.println("");
	        
	        System.out.print("Enter the basic salary: ");
	        double basicSalary1 = scanner.nextDouble();

	        double hra1, da1;

	        if (basicSalary1 < 1500) {
	            hra1 = 0.10 * basicSalary1;
	            da1 = 0.90 * basicSalary1;
	        } else {
	            hra1 = 500;
	            da1 = 0.98 * basicSalary1;
	        }

	        double grossSalary1 = basicSalary1 + hra1 + da1;

	        System.out.println("Gross Salary: " + grossSalary1);
	        System.out.println("");
	        
	        System.out.print("Enter the marks obtained in subject 1: ");
	        double subject1 = scanner.nextDouble();

	        System.out.print("Enter the marks obtained in subject 2: ");
	        double subject2 = scanner.nextDouble();

	        System.out.print("Enter the marks obtained in subject 3: ");
	        double subject3 = scanner.nextDouble();

	        System.out.print("Enter the marks obtained in subject 4: ");
	        double subject4 = scanner.nextDouble();

	        System.out.print("Enter the marks obtained in subject 5: ");
	        double subject5 = scanner.nextDouble();

	        double totalMarks1 = subject1 + subject2 + subject3 + subject4 + subject5;
	        double percentage1 = (totalMarks1 / 500) * 100;

	        String division;

	        if (percentage1 >= 60) {
	            division = "First Division";
	        } else if (percentage1 >= 50 && percentage1 <= 59) {
	            division = "Second Division";
	        } else if (percentage1 >= 40 && percentage1 <= 49) {
	            division = "Third Division";
	        } else {
	            division = "Fail";
	        }

	        System.out.println("Division Obtained: " + division);
	        
	        scanner.close();
	    }
}
