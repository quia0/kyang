package output2;

import java.util.Scanner;

public class output2 {

    
    public static void main(String[] args) {
      Scanner ki =  new Scanner (System.in);
         
         int number;
         System.out.print("Enter a Number: ");
         number = ki.nextInt();
         
         
         if (number > 0){
             System.out.println(number+" is a Positive Number");
         }else if (number < 0){
             System.out.println(number+" is a Negative Number");
         }else 
             System.out.println("Inputted Number Zero");
    
    
    }
}