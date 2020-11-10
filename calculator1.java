class calculator1{
     public static void add(int a,int b)
     {
     int sum=0;
     sum=a+b;
     System.out.println("sum of two numbers ="+sum);
     }
  public static void subtract(int a,int b)
     {
     int sub=0;
     sub=a-b;
     System.out.println("subtraction of two numbers ="+sub);
     }
  public static void multiply(int a,int b)
     {
     int multi=0;
     multi=a*b;
     System.out.println("product of two numbers ="+multi);
     }
  public static void division(int a,int b)
     {
     int divide=0;
     divide=a%b;
     System.out.println("division of two numbers ="+divide);
     }
   public static void main(String args[])
     {
      int x=40;
      int y=100;
      calculator1.add(x,y);
      calculator1.subtract(x,y);
      calculator1.multiply(x,y);
      calculator1.division(x,y);
     }
  
}