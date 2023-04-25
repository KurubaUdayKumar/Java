import java.io.*;

class StringBuffercapacity
{
public static void main(String args[]){
StringBuffer s1 = new StringBuffer();
System.out.println(s1.capacity());
System.out.println(s1.length());
System.out.println("");
s1.append("Java");
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(s1.length());
System.out.println("");
s1.insert(1,"xyz");
s1.append("Programming is a object oriented language");
System.out.println(s1.capacity());
System.out.println(s1.length());
System.out.println(s1);
s1.replace(1,3,".");
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(s1.length());
s1.delete(1,3);
System.out.println("");
System.out.println(s1);
s1.reverse();
System.out.println(s1);
System.out.println(s1.capacity());
System.out.println(s1.length());
}
}