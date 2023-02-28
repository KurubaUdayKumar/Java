import java.util.Scanner;
class Switch
{
public static void main(String[] args)
{
int num;
Scanner in = new Scanner(System.in);
System.out.println("enter num");
num=in.nextInt();
switch(num)
{
case 0:
System.out.println("Number is 0");
break;
case 1:
System.out.println("Number is 1");
break;
case 2:
System.out.println("Number is 2");
break;
default:
System.out.println("num doesn't match any case label ");
}
}
}

