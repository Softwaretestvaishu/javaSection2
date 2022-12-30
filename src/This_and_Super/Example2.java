package This_and_Super;



public class Example2 extends Example1 {
	
	int a=20;
	
	public void M1(){
		
		int a=30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		Example2 s1=new Example2();
	s1.M1();
	}

}
