
interface in4
{
 boolean factor(int n1,int n2);
}
class Lambdamain
{
public static void main(String[] args)
{
 in3 Isfactor;
 Isfactor=(n1,n2)->{
if(n2%n1==0)

 return true;

else

 return false;
};
System.out.println("Is factor:"+Isfactor.test(4,2));
}
}