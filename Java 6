//Emp.java
package employee;
public class Emp{
 String name,empid, category;
 int bpay;
 double hra,da,npay,pf,grosspay,incometax,allowance;
 public Emp(String n, String id, String c, int b)
 {
   name = n;
   empid = id;
   category = c;
   bpay = b;
 }
 public void call()
 {

   da = bpay*0.05;
   hra = bpay*0.09;
   pf = bpay*0.11;
   allowance = bpay*0.10;
   grosspay = bpay+da+hra+allowance-pf;
   incometax = 0.75*grosspay;
   npay = grosspay- incometax;
  }

 public void display()
 {
   System.out.println("/n/n Employee Details");
   System.out.println("/n/n Name:"+name);
   System.out.println("/n/n Empid:"+empid);  
   System.out.println("/n/n Category:"+category);      
   System.out.println("/n/n bpay:"+bpay);
   System.out.println("/n/n da:"+da);
   System.out.println("/n/n hra:"+hra);
   System.out.println("/n/n pf:"+pf);
   System.out.println("/n/n all:"+allowance);
   System.out.println("/n/n gs:"+grosspay);
   System.out.println("/n/n Incometax:"+incometax);
   System.out.println("/n/n npay:"+npay);
   }
 }

//Emppay.java
import java.io.*;
import employee.Emp;
class Emppay
{

 public static void main(String args[])
 {

   Emp e = new Emp("ANU","23","Female",12000);
   e.call();
   e.display();
   }
 }
