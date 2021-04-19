package cons_1;

public class Computer {
	
		public double wordsize;
		public double storagesize;
		public double memorysize; 
		public double speed; 
		
		public Computer(){ 
		wordsize =0; 
		storagesize = 0;
		memorysize=0; 
		speed = 0; } 
		
		public Computer(double ws,double ss,double ms,double s){
			wordsize =ws;
			storagesize = ss;
			memorysize=ms;
			speed = s; } 
		public void display() {
			System.out.println("Word Size = "+wordsize+"\nStorage Size = "+storagesize + "\nMemory size = "+ memorysize +" \nSpeed = "+ speed );
			} 
		}


