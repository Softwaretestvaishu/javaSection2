package Interface;

public class Example1_ImplementationClass implements Example1_Interface1{

public void M1()
{
System.out.println("a");	
}
	
	public void M2()
	{
		System.out.println("s");
	}
	
	public static void main(String[] args) {
		
		Example1_ImplementationClass a1=new Example1_ImplementationClass();
		a1.M1();
		a1.M2();
	}
}
