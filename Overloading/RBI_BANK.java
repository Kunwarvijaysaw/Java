package Overloading;


public class RBI_BANK 
	{
	int getrateOfInterest(){
		return 0;}
	}
	//Child bank
	class SBI extends RBI_BANK {
	int getrateOfInterest(){
		return 10;}
	}
	class ICICI extends RBI_BANK {
	int getrateOfInterest(){
		return 15;}
	}
	class AXIS extends RBI_BANK {
		int getrateOfInterest(){
			return 20;}
	}
	class HDFC extends RBI_BANK {
		int getrateOfInterest(){
			return 30;}
	}