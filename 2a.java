class A
{
   private int mobile_number;
   private int regno;

   public int usn;
   public int age;
   
   protected float a,b;

   A()
   {
      mobile_number=12345;
      regno=123;
      usn=1321;
      age=30;
      a=1.3;
      b=2.3;
   }
   A(int mobile_number,int regno,int usn,int age,float a,float b)
   {
      mobile_number=mob_no;
      regno=rno;
      usn=u_no;
      age=ag;
}
class C extends A
{
   System.out.println("I am in class C");
   super(A);
}
class D extends C
{
   System.out.println("I am in class D");
   super(A);
}
class B extends A
{
   System.out.println("I am in class B");
   super(A);
}
class demo
{
   public static void main(String args[])
   {
      A a1 = new A();
      A a2 = new A(12345,123,1321,30,1.3,2.3);
      System.out.println(a1.mob_no);
      System.out.println(a1.rno);
      System.out.println(a1.u_no);
      System.out.println(a1.age);
      System.out.println(a1.a);
      System.out.println(a1.b);
   }
}
