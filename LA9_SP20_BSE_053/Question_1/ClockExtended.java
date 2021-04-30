package LAB9Ass;

public class ClockExtended extends Clock{
	 public ClockExtended(String hours, String minutes, String seconds){
	        super(hours, minutes, seconds);
	    }
	        
	    public void display(){
	        
	        System.out.println("Twenty-Fout(24) Hour Format:");
	        super.display();
	        System.out.println("Twelve(12) Hour Format:");
	        
	        int h1 = (int)hours.charAt(0) - '0';
	        int h2 = (int)hours.charAt(1)- '0';
	        int tohour = h1 * 10 + h2;
	        String mode;
	        if(tohour < 12)
	            mode="AM";
	        else
	            mode="PM";
	        tohour %= 12;
	        if (tohour == 0) {
	            System.out.print("12");
	            System.out.print(" :"+minutes+" :"+seconds);
	        }
	        else{
	            System.out.print(tohour);
	            System.out.print(":"+minutes+":"+seconds);
	        }
	        System.out.println(" "+mode);
	    }
	}

