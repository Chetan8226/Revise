package oops_Concept;

public class Demo_Encapsulation 
{
	private double Sal;
	public void Set(double Salary)
	{
		Sal=Salary;
	}
	public double Get()
	{
		return Sal;
	}
	public void Display()
	{
		System.out.println("Salary = " + Sal);
	}

	public static void main(String[] args) 
	{
		Demo_Encapsulation obj=new Demo_Encapsulation();
		obj.Sal=55000.02;
		obj.Set(55000.02);
		System.out.println(obj.Get());
		obj.Display();

	}

}
