package methodes_Revise;

public class Static_Method_Call_From_Same_Class 
{
	public static void Chet()
	{
		System.out.println("This is Static Method");
	}

	public static void main(String[] args) 
	{		
		System.out.println("This is Main Method");
		Chet();
	}

}
