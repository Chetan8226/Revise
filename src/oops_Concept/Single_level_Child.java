package oops_Concept;

public class Single_level_Child extends Single_Level_Parent
{
	public void Bike()
	{
		System.out.println("Child Have a Bike");
	}

	public static void main(String[] args) 
	{
		Single_level_Child obj=new Single_level_Child();
		obj.Bike();
		obj.Car();
		obj.Home();
		
		
	}

}
