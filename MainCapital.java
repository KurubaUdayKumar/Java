import java.util.*;
class dog
{
	protected String name;
	String speak;
	
	dog()
	{
		Scanner kl=new Scanner(System.in);
		name=kl.nextLine();
		speak=kl.nextLine();
		
	}
      String  name()
	{
		return balm;
	}
	String speak()
	{
		return woof;
	}
}
class labrador extends dog
{
	private String color;
	private int weight;
	labrador(String name,String color,int weight)
	{
		this.name=name;
		this.color=color;
		this.weight=weight;
	}
      String speak()
      {
      return Bark;
      }
      int breedweight()
      {
      return 60;
      }
	void print()
	{
		System.out.print(name);
		System.out.print(color);
		System.out.print(weight);
	}
}
class MainCapital
{
	public static void main(String[] args)
	{
	labrador L1=new labrador("Balm","Black",30);
	L1.print();
		
	}
}