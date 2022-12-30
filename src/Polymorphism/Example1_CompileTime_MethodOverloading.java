package Polymorphism;

public class Example1_CompileTime_MethodOverloading {
	
	public void name(String a)
	{
		System.out.println(a);
	}

	
	public void name(String b,int c)
	{
		System.out.println(b);
	}
	
	//here i use static method
	public static void name1(String a)
	{
		System.out.println(a);
	}

	
	public static void name1(String b, int d)
	{
		System.out.println(b);
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		Example1_CompileTime_MethodOverloading s1=new Example1_CompileTime_MethodOverloading();
		s1.name("Vaishali");
		s1.name("Rucha");
		s1.name("bharud");
		
		name1("Vaishali");
		name1("kjadnvjk", 5);
	}
}
