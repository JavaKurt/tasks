package testpage;

import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import static java.util.Locale.*;

// CONVERTING NUMBER INTO LOCALE CURRENCY 

public class localeCurrency {
 
    public static void getCurrency() {
        
     //take an amount of money and concert this money into US, Indian, Chinese or French
     Scanner scan = new Scanner(System.in);
     double payment = scan.nextDouble();
     
     scan.close();

     NumberFormat format = NumberFormat.getCurrencyInstance(US);       
     System.out.println("US: " + format.format(payment));
     
     format = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
     System.out.println("India: " + format.format(payment));
     
     format = NumberFormat.getCurrencyInstance(CHINA);
     System.out.println("China: " + format.format(payment));
     
     format = NumberFormat.getCurrencyInstance(FRANCE);
     System.out.println("France: " + format.format(payment));
     

}
}