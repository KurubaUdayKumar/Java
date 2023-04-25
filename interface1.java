interface vehicle
{
 void gearchange(int x);
 void speedincrease(int x);
 void brakes(int x);
}
class car implements vehicle
{
 public void gearchange(int x)
 {
   System.out.println(x);
 }
  public void speedincrease(int x)
 {
  System.out.println(x);
 }
 public void brakes(int x)
 {
  System.out.println(x);
 }
}
class bike implements vehicle
{
 public void gearchange(int x)
 {
   System.out.println(x);
 }
 public void speedincrease(int x)
 {
  System.out.println(x);
 }
 public void brakes(int x)
 {
  System.out.println(x);
 }
}
class interface1
{
 public static void main(String[] args)
 {
  System.out.println("bike details");
   bike b = new bike();
   b.gearchange(2);
   b.speedincrease(30);
   b.brakes(20);
 
  System.out.println("car details");
   car c = new car();
   c.gearchange(2);
   c.speedincrease(30);
   c.brakes(20);
 
   
 }
}
