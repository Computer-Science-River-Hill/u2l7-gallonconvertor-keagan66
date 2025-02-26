package org.example;
import java.text.NumberFormat;
import java.util.Scanner;
class Main {
 public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the number of gallons: ");
   double A = scanner.nextInt();
   NumberFormat decimal = NumberFormat.getNumberInstance();
   System.out.println("In " + decimal.format(A) + " gallons there are:");
   double B = A*4.0;
   double C = B*2.0;
   double D = C*2.0;
   double E = D*16.0;
   System.out.println(decimal.format(B) + " quarts");
   System.out.println(decimal.format(C) + " pints");
   System.out.println(decimal.format(D) + " cups");
   System.out.println(decimal.format(E) + " tablespoons");
 }
}

