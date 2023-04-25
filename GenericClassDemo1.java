import java.util.Scanner;

class Gen<T1,T2>
{
  T1 num1;
  T2 num2;
  Gen()
  {

  }
  Gen(T1 x,T2 y)
  {
      num1=x;
      num2=y;
  }
  T1 print1()
  {
      return num1;
  }
  T2 print2()
  {
      return num2;
  }
}

public class GenericClassDemo1
{
   public static void main(String[] args)
   {
      Gen<Integer,String> obj1 = new Gen<Integer, String>(20,"JAVA");
      System.out.println(obj1.print1());
      System.out.println(obj1.print2());


   }
}
