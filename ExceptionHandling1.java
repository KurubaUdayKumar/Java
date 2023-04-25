import java.util.Scanner;

class Exceptionhandling1{
public static void main(String args[])
{
Scanner scr = new Scanner(System.in);
int a = scr.nextInt();
int b = scr.nextInt();
try
{
int answer = a/b;
 System.out.println("Result :" + answer);
int arr[] = new int[5];
arr[6]=19;
}
catch(ArithmeticException x)
{
 System.out.println("invalid input");
}

catch(Exception x)
{
 System.out.println("invalid input1");
}
System.out.println("End");
}
}