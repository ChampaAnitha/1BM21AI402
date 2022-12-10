abstract class Marks{
double percent;
abstract double getPercentage();
}

class A extends Marks{
A(int a,int b, int c)
{
 percent=(a+b+c)/3.0;
}
double getPercentage()
{
 return percent;
}
}

class B extends Marks{
B(int a,int b, int c,int d)
{
 percent=(a+b+c+d)/4.0;
}
double getPercentage()
{
 return percent;
}
}

class assign3{
public static void main(String args[])
{
 A a = new A(70,75,80);
 B b = new B(70,80,90,95);
 System.out.println("Percentage of student A = "+a.getPercentage());
 System.out.println("Percentage of student B = "+b.getPercentage()); 
}
}
