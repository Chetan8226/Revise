package methodes_Revise;

public class Static_Method_ReturnType_Same_Class 
{
	public static int chet()
	{
		int a=10;
		int b=20;
		int mul=a*b;
		return mul;
		
	}

	public static void main(String[] args) 
	{
		System.out.println("This is main method");
		int out = chet();
		System.out.println("Multiply a*b = "+out);
	}

}
