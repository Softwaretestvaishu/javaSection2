package Access_Specifier;

public class Example4_public {
	
	public int a;
	
	public Example4_public()
	{
		System.out.println("public Contrusctor");
		a=10;
		System.out.println(a);
	}
	
	public void M1()
	{
		System.out.println("Access Specifier : public");
	}
	
	public static void main(String[] args) {
		
		Example4_public s1=new Example4_public();
		s1.M1();
	}

}
