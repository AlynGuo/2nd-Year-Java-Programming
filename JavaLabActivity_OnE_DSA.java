

import java.util.Scanner;
public class JavaLabActivity_OnE_DSA {
    
    public static void main(String[]args){
        
       int values[] = new int[5];
       
       Scanner input = new Scanner(System.in);
       int x, sum = 0;
       System.out.println("Enter 5 integer values");
       for(x = 0; x < values.length; x++){
           values[x] = input.nextInt();
       }
       
       System.out.println("");
       
       for(x = 0; x < values.length; x++){
           sum += values[x];
       }
       System.out.println("Sum of Values: "+sum);
       
       System.out.println("");
       //reverse
       System.out.println("Reverse Order");
       int y = 5;
       while(y >= 1){
           y--;
           System.out.println(values[y]);
           
       }
    }
}
