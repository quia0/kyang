
package tanya;

import java.util.Scanner;

public class Tanya {

    
    public static void main(String[] args) {
         Scanner sc =  new Scanner (System.in);
         
         String nm;
        
         float hr,hw,gww,total;
         double sss,hor;
         
         System.out.print("Enter Employee Name: ");
         nm = sc.nextLine();
         System.out.print("Enter Hour Rate: ");
         hr = sc.nextInt();
         System.out.print("Enter Hour Rate: ");
         hw = sc.nextInt();
         
         System.out.println("-----Wage Summary-----");
       
         total = hr * hw;
         System.out.println("Employee: " +nm);
         System.out.println("Hourly Rate: " +hr);
         System.out.println("Hours Worked: " +hw);
         System.out.println("Gross Weekly Rate: " +total);
         
         sss = total * 0.10;
         System.out.println("SSS Contribution: " +sss);
         System.out.println("--------------------");
         hor = total - sss;
         System.out.println("Net Weekly Rage: " +hor);
         
         
         
         
         
    }
    
}
