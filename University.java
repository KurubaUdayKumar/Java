import java.util.*;

class University{
    int regno;
    University(){
        Scanner sc=new Scanner(System.in);
        regno=sc.nextInt();
    }
    void print(){
        System.out.println(regno);
    }
}
class Details extends University{
    String name;
    char grade;
    Details(int a,String b,char c){
        regno=a;
        name=b;
        grade=c;
    }
    void print(){
        System.out.println("name:"+name);
        System.out.println("regno:"+regno);
        System.out.println("grade:"+grade);
    }
}
public class inheritence2 {
    public static void main(String[] args) {
        Details D1=new Details(12,"Uday",'A');
        D1.print();
    }
}