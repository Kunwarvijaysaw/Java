//Java Program to demonstrate the example of Switch statement  
//where we are printing day name for the given number  


package ConditionStatement;

public class SwitchDay {
	public static void main(String[] args) {    
	    //Specifying day number  
	    int day = 4;
	   
	    String dayString=""; 
	    
	    //Switch statement  
	    switch(day){    
	    //case statements within the switch block  
	    case 1: dayString="1 - Sunday";  
	    break;    
	    case 2: dayString="2 - Monday"; 
	    break;    
	    case 3: dayString="3 - Tuesday";
	    break;    
	    case 4: dayString="4 - Wednesday";
	    break;    
	    case 5: dayString="5 - Thursday";
	    break;    
	    case 6: dayString="6 - Friday";
	    break;    
	    case 7: dayString="7 - Saturday";
	    break;    
	    default:System.out.println("Invalid day!");    
	    }    
	    //Printing day of the given number  
	    System.out.println(dayString);  
	}    
	}   