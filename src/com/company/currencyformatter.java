
// class currencyformatter{
//  static void printCurrency(Locale locale){  
//  double dbl=10500.3245;  
//  NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
//  String currency=formatter.format(dbl);  
//  System.out.println(currency);  
// }  
// 	public static void main(String[] args) {
// 		currencyformatter.printCurrency(Locale.UK);
// 	}
// }

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.text.NumberFormat;  

public class currencyformatter {
     static String printCurrency(Locale locale,double a)
     {  
     NumberFormat formatter=NumberFormat.getCurrencyInstance(locale);  
     String currency=formatter.format(a);  
     return currency;  
     } 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = currencyformatter.printCurrency(Locale.US,payment);
        String india = currencyformatter.printCurrency(new Locale("en","in"),payment);
        String china = currencyformatter.printCurrency(Locale.CHINA,payment);
        String france = currencyformatter.printCurrency(Locale.FRANCE,payment);
         System.out.println("US: " + us);
         System.out.println("India: " + india);
         System.out.println("China: " + china);
         System.out.println("France: " + france);

        
    }
}