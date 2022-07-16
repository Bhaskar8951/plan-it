import java. util;
class menu
{
	public static void main(string args[])
	{
		int choice;
		string order;
		scanner sc = new scanner (system.in);
		
		system.out.println("1. pepperoni pizza");
		system.out.println("2. burger");
		
		system.out.println("enter your choice");
		
		choice = sc.nextint();
		
		switch(choice)
		{ 
		case 1:
			order = " Awesome pizza place, pepperoni pizza, $20";
			break;
		case 2:
			order = " Wild burger joint, burger, $15";
			break;
			
		}
		system.out.println("your order" + order);
	}
}