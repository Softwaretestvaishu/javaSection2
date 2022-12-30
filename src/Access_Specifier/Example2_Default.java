package Access_Specifier;

public class Example2_Default {
	
	//Scope default: 
	
	 int a;
	
	 Example2_Default(int b)
	{
		System.out.println("Default Constructor");
		a=b;
		System.out.println(a);
	}
	 void M1() {
		System.out.println("Non Static Default Method");
		
	}
	 static void M2()
	{
		System.out.println("Static Default Method");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Default Constructor");
		
		Example2_Default s1=new Example2_Default(10);
		s1.M1();
		Example2_Default.M2();
		
	}

}
