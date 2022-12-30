package Inheritance;

public class Example3_Hierarchical {
	
	public static void main(String[] args) {
		
		Example3_Sub_Class_1 s1=new Example3_Sub_Class_1();
		s1.M1();
		s1.M2();
		Example3_Sub_Class_1.M3();
		
		Example3_Sub_Class_2 s2=new Example3_Sub_Class_2();
		s2.M1();
		s2.M3();
		
		Example3_Sub_Class_3 s3=new Example3_Sub_Class_3();
		s3.M1();
		s3.A1();
	
	
	}

}
