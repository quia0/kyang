
package airfare1;

import java.util.Scanner;

public class AirFare1 {

    
    public static void main(String[] args) {
       float total = 0;
             
             
            
        Scanner sc = new Scanner(System.in);
        System.out.print("Distance (KM): ");
        int km = sc.nextInt();
        
        System.out.print("Class: ");
        float cl = sc.nextInt();
        
        
        
        if (cl == 1 ){
              cl = 250;
           total = km * cl;
           if (km >= 1000){
               total = total - (total *.10f);
             }
           
         }else if(cl == 2){
         cl = 500;
           total = km * cl;
           if (km >= 1000){
               total = total - (total *.10f);
             }
           
         }
          System.out.printf("Total fare: %.2f\n", total);
        } 
        
    }
       
    
            
        
            
            
            
       