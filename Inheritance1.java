import java.util.*;

class Box
{
Scanner sc = new Scanner(System.in);
double w;
double h;
double d;
Box()
{
w=-1;
h=-1;
d=-1;
}
Box(double a,double b,double c)
{
w=a;
h=b;
d=c;
}
Box(double len)
{
w=h=d=len;
}
Box(Box ob)
{
w=ob.w;
h=ob.h;
d=ob.d;
}
double volume()
{
return w*h*d;
}
}
class BoxWeight extends Box
{
double weight;
BoxWeight(double a,double b,double c,double d)
{
w=a;
h=b;
d=c;
weight=d;
}
}
class Boxcolor extends Box
{
String col;
Boxcolor(double a,double b,double c,String j)
{
w=a;
h=b;
d=c;
col=j;
}
}
class BoxShipment extends BoxWeight
{
double cost;
BoxShipment(double a,double b,double c,double d,double e)
{
super(a,b,c,d);
cost=e;
}
}
class Inheritance1
{
public static void main(String[] args)
{
Box B = new Box();
BoxWeight B1 = new BoxWeight(10,12,13,14);
BoxWeight B2 = new BoxWeight(100,112,213,134);

Boxcolor B3 = new Boxcolor(10,12,13,"white");
Boxcolor B4 = new Boxcolor(100,112,213,"white");

BoxShipment B5 = new BoxShipment(10,12,13,122,111189);
BoxShipment B6 = new BoxShipment(100,112,213,232,919190);

System.out.println("Volume of Box1" + B1.volume());
System.out.println("weight of Box2" + B2.weight);

System.out.println("Volume of Box3" + B3.volume());
System.out.println("colour of Box3" + B3.col);

System.out.println("Volume of Box4" + B4.volume());
System.out.println("colour of Box4" + B4.col);
System.out.println("cost of Box6" + B6.cost);
}
}
