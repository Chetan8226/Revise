package simple_JAVA_Program_Revise;

public class Demo_SwitchCase 
{

	public static void main(String[] args) 
	{
		String Day="Monday";
		switch(Day)
		{
		case "Monday": System.out.println("Today is Monday");
		break;
		case "Tuesday": System.out.println("Today is Tuesday");
		break;
		case "Wednesday": System.out.println("Today is Wednesday");
		break;
		case "Thuresday": System.out.println("Today is Thuresday");
		break;
		case "Friday": System.out.println("Today is Friday");
		break;
		case "Saturday": System.out.println("Today is Saturday");
		break;
		default: System.out.println("Its Weekend");
		}
	}

}
