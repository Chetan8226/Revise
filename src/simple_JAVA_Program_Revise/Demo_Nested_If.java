package simple_JAVA_Program_Revise;

public class Demo_Nested_If 
{

	public static void main(String[] args) 
	{
		String UserName="Admin";
		String Password="Admin@123";
		if(UserName=="Admin")
		{
			if(Password=="Admin@123")
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Password Incorrect");
			}
			
		}
		else
		{
			System.out.println("UserName Incorrect");
		}

	}

}
