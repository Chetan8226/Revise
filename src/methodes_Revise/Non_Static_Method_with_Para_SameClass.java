package methodes_Revise;

public class Non_Static_Method_with_Para_SameClass 
{
	public void Display(String Name)
	{
		System.out.println("Name = " + Name);
		
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		Non_Static_Method_with_Para_SameClass obj=new Non_Static_Method_with_Para_SameClass();
		obj.Display("Chetan Nannaware");
	}

}
