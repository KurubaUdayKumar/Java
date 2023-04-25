import java.util.Scanner;

class Stats<T extends Number>
{
  T[] nums;
  Stats(T[] o)
  {
    nums=o;
  }
  double average()
  {
    double sum=0.0;
    for(int i=0;i<nums.length;i++)
          sum+=nums[i].doubleValue();//doublevalues is not mandatory and is used to read the value 
    return sum/nums.length; 
  }
  Boolean average(Stats<?> ob)
  {
    if(average()==ob.average())
              return true;
    else
              return false;
  }
  
}
class Bounddemo
{
  public static void main(String[] args)
  {
   Integer inums[] = {1,2,3,4,5};
   Stats<Integer> iob = new Stats<Integer>(inums);
   System.out.println("Average of Integer: "+iob);

   Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
   Stats<Double> dob = new Stats<Double>(dnums);
   System.out.println("Average of Double: "+dob);

   System.out.println("Average: "+iob.average(dob));
  
  }
}