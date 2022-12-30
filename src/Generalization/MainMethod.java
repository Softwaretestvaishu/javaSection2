package Generalization;

public class MainMethod {
	
	public static void main(String[] args) 
	{
		System.out.println("--Features of Jio Simcard--");
		Example1_Jio j=new Example1_Jio();
		j.sms();
		j.audioCalling();
		j.data();
		j.newFeatureA();
		
		System.out.println("--Featues of VI simcard--");
		
		Example1_VI v=new Example1_VI();
		v.sms();
		v.audioCalling();
		v.data();
		v.newFeatureB();
		
		System.out.println("--Featues of Airtel simcard--");
		
		Example1_Airtel a=new Example1_Airtel();
		a.sms();
		a.audioCalling();
		a.data();
		a.newFeatureC();
		
	}



}
