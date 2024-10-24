package constructor;

public class Demo_constructor 
{
	int a;
	int b;
	public Demo_constructor()
	{
		a=10;
		b=20;
		System.out.println("This is constructor = ");
		
	}
	public void display()
	{
		int Add=a+b;
		System.out.println("Value of A = " + a);
		System.out.println("Value of B = " + b);
		System.out.println("Add A+B = " + Add);
	}

	public static void main(String[] args) 
	{
		Demo_constructor obj=new Demo_constructor();
		obj.display();
		
	}

}
