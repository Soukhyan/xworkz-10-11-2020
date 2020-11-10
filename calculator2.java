class calculator2
{
     public static int add(int a,int b)
     {
     int sum=0;
     sum=a+b;
     System.out.println("sum of two numbers ="+sum);
     return sum;
     }
  public static int subtract(int a,int b)
     {
     int sub=0;
     sub=a-b;
     System.out.println("subtraction of two numbers ="+sub);
     return sub;
     }
  public static int multiply(int a,int b)
     {
     int multi=0;
     multi=a*b;
     System.out.println("product of two numbers ="+multi);
     return multi;
     }
  public static int division(int a,int b)
     {
     int divide=0;
     divide=a/b;
     System.out.println("division of two numbers ="+divide);
     return divide;
      }
   public static void main(String args[])
     {
      calculator2.add(10,20);
      calculator2.subtract(10,20);
      calculator2.multiply(10,20);
      calculator2.division(10,20);
     }
  
}