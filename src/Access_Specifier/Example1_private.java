package Access_Specifier;

public class Example1_private {
	
	private int a;
	
	private Example1_private(int b)
	{
		System.out.println("Private Constructor");
		a=b;
		System.out.println(a);
	}
	
	private void M1() {
		System.out.println("Non Static Private Method");
		
	}
	private static void M2()
	{
		System.out.println("Static Private Method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Private Constructor");
		
		Example1_private s1=new Example1_private(10);
		s1.M1();
		Example1_private.M2();
		
	}

}
