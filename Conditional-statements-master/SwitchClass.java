package Descion_making_statements;

public class SwitchClass {
    public String stringSwitch(String Month){
        String Message;
        switch(Month.toLowerCase()){

            case "january":
			Message = "You have entered January and Month Number  = 1";
		    break;
		    case "february":
			Message = "You have entered February and Month Number  = 2";
		    break;
		    case "march":
			Message = "You have entered March and Month Number  = 3";
		    break;
		    case "april":
			Message = "You have entered April and Month Number  = 4";
		    break;
		    case "may":
			Message = "You have entered May and Month Number  = 5";
		    break;
		    case "june":
			Message = "You have entered June and Month Number  = 6";
		    break;
		    case "july":
			Message = "You have entered July and Month Number  = 7";
		    break;
		    case "august":
			Message = "You have entered August and Month Number  = 8";
		    break;
		    case "september":
			Message = "You have entered September and Month Number  = 9";
		    break;
		    case "october":
			Message = "You have entered ApOctober and Month Number  = 10";
		    break;
		    case "november":
			Message = "You have entered November and Month Number  = 11";
		    break;
		    case "december":
			Message = "You have entered December and Month Number  = 12";
		    break;
            default:
            Message="Please enter the Proper Month name";
            break;
        }
        return Message;
    }
}
