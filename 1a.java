import java.io.*;

import java.util.Scanner;

 


public class RetailItem {

     private String description;

     private int units;

     private double price;

 


     public RetailItem()

     {

         

     }

 


     public RetailItem(String x, int y, double z)

{

          description = x;

          units = y;

          price = z;

     }

    


     public void setDescription(String x)

     {

          description = x;

     }

 

     public void setPrice(double z) {

          price = z;

     }

 

     void setUnits(int y) {

          units = y;

     }

 


     public int getUnits()

     {

          return units;

     }

 

     public String getDescription()

     {

          return description;

     }

 

     public double getPrice()

     {

          return price;

     }

 

    


     public static void main(String[] args)

     {

 

          String str = "Shoes";

RetailItem r1 = new RetailItem("Shades", 12, 3000);

RetailItem r2 = new RetailItem("watches", 40, 6000);

          RetailItem r3 = new RetailItem();

        

          r3.setDescription(str);

          r3.setUnits(20);

          r3.setPrice(5000);

 


System.out.println("Description\tUnits on Hand\tPrice\t\n");


 


System.out.println("1\t" + r1.getDescription() + "\t\t" + r1.getUnits() + " \t" + r1.getPrice());

System.out.println("2\t" + r2.getDescription() + "\t\t" + r2.getUnits() + " \t" + r2.getPrice());

System.out.println("3\t" + r3.getDescription() + "\t\t" + r3.getUnits() + " \t " + r3.getPrice());

          System.exit(0);

     }
