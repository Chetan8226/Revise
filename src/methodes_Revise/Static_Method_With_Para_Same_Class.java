package methodes_Revise;

public class Static_Method_With_Para_Same_Class 
{
	public static void chet()
	{
		int a=200;
		int b=300;
		int sum=a+b;
		System.out.println("Addition of a+b = " + sum);
		
	}
	public static void chet1(int a)
	{
		int sum;
		sum=a+a;
		System.out.println("Addition of a+a = " + sum);
		
	}
	public static void chet2(int a, int b)
	{
		int sum=a+b;
		System.out.println("Addition of a+b = " + sum);
		
	}
	public static void chet3(int a, int b)
	{
		int sub=a-b;
		System.out.println("Substraction of a-b = " + sub);
		
	}
	public static void chet4(int a, int b, int c)
	{
		int mul=a*b*c;
		System.out.println("Multiply a*b*c = " + mul);
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Main ha been started");
		chet();
		chet1(10);
		chet2(10, 20);
		chet3(10, 20);
		chet4(10, 20, 30);
	}

}
