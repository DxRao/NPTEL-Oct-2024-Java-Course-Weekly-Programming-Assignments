package week_1;

import java.util.Scanner;
public class PA_1 { 
   public static void main(String[] strings) {
       double width ;
       double height;

       Scanner in = new Scanner(System.in);
       width = in.nextDouble();
       height = in.nextDouble();
       // Calculate the perimeter of the rectangle
       double perimeter = 0.00;

       perimeter = 2 * (width + height);


       // Calculate the area of the rectangle

       double area = 0.00;

       area = width * height;
       
       // Print the calculated perimeter using place holders for values
       System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f\n", height, width, perimeter);

       // Print the calculated area using placeholders for values
       System.out.printf("Area is %.1f * %.1f = %.2f", width, height, area);    
   }
}