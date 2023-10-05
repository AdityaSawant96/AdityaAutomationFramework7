package decisionMakingStatement;

public class NestedIf {

	public static void main(String[] args) {
   
		String userName ="John";
		
		String passWord ="ck@je";

		if(userName=="John")
		{
			
			if(passWord=="ck@je")
			{
				
				System.out.println("Click on login Btn");
				
			}
			
			else
			{
				
				System.out.println("Correct you are Password");

			}
		}
		else
		{
			System.out.println("Correct you are UserName");

		}
			
			
		
	}

}
