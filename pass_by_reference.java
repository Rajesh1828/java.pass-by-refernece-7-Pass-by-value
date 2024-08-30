//pass byb reference


class car
{
	String name;
	float cost;
	int seats;
	
}


 
public class pass_by_reference {

	public static void main(String[] args)
	{
	   car a=new car();
	   a.name = "maruthi";
	   a.cost = 18.8f;
	   a.seats = 5;
	   System.out.println(a.name);
	   System.out.println(a.cost);
	   System.out.println(a.seats);
	   
	   
	   car b;
	   b = a;
	   b.name = "Bmw";
	   b.cost = 25f;
	   b.seats = 7;
	   System.out.println(b.name);
	   System.out.println(b.cost);
	   System.out.println(b.seats);
	   
	   car c;
	   c = b;
	   c.name = "kia";
	   c.cost = 15.9f;
	   c.seats = 7;
	   System.out.println(c.name);
	   System.out.println(c.cost);
	   System.out.println(c.seats);
	   
	   
    
	}

}