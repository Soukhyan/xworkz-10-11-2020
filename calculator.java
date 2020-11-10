class calculator{
     public static void add()
     {
     int a=10;
     int b=20;
     int sum=0;
     sum=a+b;
     System.out.println("sum of two numbers ="+sum);
     }
  public static void subtract()
     {
     int a=10;
     int b=20;
     int sub=0;
     sub=a-b;
     System.out.println("subtraction of two numbers ="+sub);
     }
  public static void multiply()
     {
     int a=10;
     int b=20;
     int multi=0;
     multi=a*b;
     System.out.println("product of two numbers ="+multi);
     }
  public static void division()
     {
     int a=10;
     int b=20;
     int divide=0;
     divide=a%b;
     System.out.println("division of two numbers ="+divide);
     }
   public static void main(String args[])
     {
      calculator.add();
      calculator.subtract();
      calculator.multiply();
      calculator.division();
     }
  
}