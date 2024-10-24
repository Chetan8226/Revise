package simple_JAVA_Program_Revise;

public class MemoryManagement_Using_Static_Variable
{
	static int a=0;
	int b=0;
	public void add()
	{
		a++;
		b++;
		System.out.println(a+ "--------"+b);
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
	}


	public static void main(String[] args) 
	{
		MemoryManagement_Using_Static_Variable obj=new MemoryManagement_Using_Static_Variable();
		obj.add();
		MemoryManagement_Using_Static_Variable obj1=new MemoryManagement_Using_Static_Variable();
		obj1.add();
		MemoryManagement_Using_Static_Variable obj2=new MemoryManagement_Using_Static_Variable();
		obj2.add();
				

	}

}
