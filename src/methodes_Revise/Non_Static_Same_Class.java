package methodes_Revise;

public class Non_Static_Same_Class 
{
	public void Chet()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println("Addition of a+b = " + sum);
	}

	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		Non_Static_Same_Class obj=new Non_Static_Same_Class();
		obj.Chet();
	}

}
