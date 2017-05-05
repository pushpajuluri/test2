package weekendtest2;



public class Powerof10 {
	int exists;
	String english="";
	boolean valid=true;
	public String get(int power){
	switch(power)
	{
	case 6: english="million";
	break;
	case 9: english = "billion";
	break;
	case 12: english = "trillion";
	break;
	case 15: english = "quadrillion";
	break;
	case 18: english = "quintillion";
	break;
	case 21: english = "sextillion";
	break;
	case 30: english = "nonillion";
	break;
	case 100: english = "googol";
	break;
	default:  valid = false;
	
	
	
	
	}
	if(valid)
	{
	System.out.println("10 raised to the"+power+"power is a "+english);
	}
	else{
		System.out.println("there is no single word for 10 rasied to the"+power+"power");
	}
	
	return english;
	}
}

