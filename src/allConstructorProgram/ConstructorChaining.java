
package allConstructorProgram;

public class ConstructorChaining {
	int a=40;
	public ConstructorChaining()
	{
		this(20, "MAHADEV");
		a=10;
		System.out.println("Aditya Is GREAT");
	}
	
	public ConstructorChaining(int b,String userName)
	{
		b=10;
		System.out.println(this.a+b);
	}
	
	/*public static void main(String []args)
	{
		
		ConstructorChaining cs = new ConstructorChaining();
		ConstructorChaining cs1 = new ConstructorChaining(20,"SINGHAM");

		
		
	}*/
	
	
	
	
	

}
