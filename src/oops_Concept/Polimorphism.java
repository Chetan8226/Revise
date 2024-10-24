package oops_Concept;

public class Polimorphism 
{
	public void add()
	{
		System.out.println("Addition of 10+20 = " + (10+20));
	}
	public void add(int a)
	{
		System.out.println("Addition of A+A = " + (a+a));
	}
	public void add(int a, int b)
	{
		System.out.println("Addition of A and B = " + (a+b));
	}
	public void add(double a)
	{ 
		System.out.println("Addition of double = " + (a+a));
	}
	public void add(int a, int b, int c)
	{ 
		System.out.println("Addition of a+b+c = " + (a+b+c));
	}

}
