package simple_JAVA_Program_Revise;

public class Demo_Else_If 
{

	public static void main(String[] args) 
	{
		int Marks=45;
		if(Marks>=40&&Marks<=60)
		{
			System.out.println("Student Pass in Second Class");
		}
		else if(Marks>=60&&Marks<=75)
		{
			System.out.println("Student Pass in First Class");
		}
		else if(Marks>=75&&Marks<=90)
		{
			System.out.println("Student Pass in Distinction");
		}
		else if(Marks>=90&&Marks<=100)
		{
			System.out.println("Student in Merit");
		}
		else if(Marks>=100)
		{
			System.out.println("Invalid input, Please enter correct Marks");
		}
		else
		{
			System.out.println("Student is Fail in JAVA");
		}
		
	}

}
