import java.io.*;

class StringBufferMain
{
public static void main(String args[]){
StringBuffer s1 = new StringBuffer("Java Programming");
System.out.println(s1);
s1.append(" Language");
System.out.println(s1);
s1.insert(1,"xyz");
System.out.println(s1);
s1.replace(1,3,".");
System.out.println(s1);
s1.delete(1,3);
System.out.println(s1);
s1.reverse();
System.out.println(s1);

}
}