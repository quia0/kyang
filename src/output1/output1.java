package output1;

import java.util.Scanner;

public class output1 {

    public static void main(String[] args) {
      
    
     Scanner ki = new Scanner (System.in);
     
       int number, reminder;
      
    
        System.out.print("Enter a number: ");
        number = ki.nextInt();
        
        reminder = number % 2;
        
       
        
        if (number == 0){
            System.out.println("Inputted Number Zero");
        } else if (reminder == 0){
            System.out.println("Inputted Number is Even");
           
        }else 
            System.out.println("Inputted Number is Odd");
    }
    
}