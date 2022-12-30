package Access_Specifier;

public class Example3_Protected {
	
	protected int a;
	
	protected Example3_Protected()
	{
		System.out.println("protected Contrusctor");
		a=10;
		System.out.println(a);
	}
	
	protected void M1()
	{
		System.out.println("Access Specifier : Protected");
	}
	
	
}
