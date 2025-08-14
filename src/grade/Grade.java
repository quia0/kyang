package grade;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner ki = new Scanner(System.in);
        String name;
        int sci, his, math, soc, arts;

        System.out.print("Enter Name: ");
        name = ki.nextLine();
        System.out.print("Enter Marks In Science: ");
        sci = ki.nextInt();
        System.out.print("Enter Marks In History: ");
        his = ki.nextInt();
        System.out.print("Enter Marks In Math: ");
        math = ki.nextInt();
        System.out.print("Enter Marks In Soc: ");
        soc = ki.nextInt();
        System.out.print("Enter Marks In Arts: ");
        arts = ki.nextInt();

        int marks = sci + his + math + soc + arts;
        float percentage = marks / 5.0f;

        System.out.print("Total Marks: " + marks);
        System.out.printf("\nTotal Percentage: %.2f\n", percentage);

        String remarks;

        if (percentage < 70) {
            remarks = "Fail";
        } else if (percentage >= 70 && percentage <= 75) {
            remarks = "Poor";
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "Fair";
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "Good";
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "Very Good";
        } else if (percentage >= 91 && percentage <= 100) {
            remarks = "Excellent";
        } else {
            remarks = "Invalid";
        }
    
        System.out.println("Remarks: " +remarks);

        if (percentage >= 70) {

            System.out.println("Congrats " + name + ", you passed.");

        } else {

            System.out.print("Try Again");
        }
    }

}
