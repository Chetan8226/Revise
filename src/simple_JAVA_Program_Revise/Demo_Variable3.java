package simple_JAVA_Program_Revise;

public class Demo_Variable3 
{
	static int a=10;
	int b=20;
	public void chet()
	{
		a++;
		b++;
		System.out.println(a + "-------" + b);
	}

	public static void main(String[] args) 
	{
		Demo_Variable3 obj=new Demo_Variable3();
		obj.chet();
		Demo_Variable3 obj1=new Demo_Variable3();
		obj1.chet();
		Demo_Variable3 obj2=new Demo_Variable3();
		obj2.chet();
	}

}
