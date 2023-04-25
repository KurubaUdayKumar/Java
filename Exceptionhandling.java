import java.util.scanner;

class Exceptionhandling1{
public static void main(String args[])
{
Scanner scr = new Scanner(System.in);
int a = scr.nextInt();
int b = scr.nextInt();
try
{
 System.out.println(a/b);
 if(b==0)
{
 throw b;
}
}
catch(int x)
{
 System.out.println("invalid input");
}
}
}