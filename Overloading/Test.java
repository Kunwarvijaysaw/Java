package Overloading;



public class Test {

	public static void main(String args[]){ 
		SBI s = new SBI();  
		ICICI i = new ICICI();  
		AXIS a = new AXIS();  
		HDFC h = new HDFC();
		System.out.println("SBI Rate of Interest: "+ s.getrateOfInterest());  
		System.out.println("ICICI Rate of Interest: "+i.getrateOfInterest());  
		System.out.println("AXIS Rate of Interest: "+a.getrateOfInterest()); 
		System.out.println("HDFC Rate of Interest: "+h.getrateOfInterest());
		}  
		}  