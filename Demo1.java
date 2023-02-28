import java.util.Scanner;
class Demo1
{
public static void main(String[] args)
{
int x,y;
Scanner in = new Scanner(System.in);
System.out.println("Enter the values of x and y");
x=in.nextInt();
y=in.nextInt();
if(x>y)
{
System.out.println(x+"is large");
}
else
{
System.out.println(y+ "is large");
}
System.out.println("Outside the condition,program ends");
}

}


