package cons_1;

public class Laptop extends Computer {
	 private double length;
	 private double width;
	 private double height;
	 private double weight;
	 
	 public Laptop() {
		 super(); 
		 length =0;
		 width = 0; 
		 height=0; 
		 weight =0; }
	 
	 public Laptop(double a, double b ,double c ,double d, double l,double wd,double h,double w) {
		 super(a,b,c,d);
		 length =l;
		 width = wd;
		 height=h;
		 weight =w; }

	public void display() { System.out.println("Word Size = "+wordsize+" \nStorage Size = "+storagesize + " \nMemory size = "+ memorysize +"\nSpeed = "+ speed+ "\nLength = " + length + " \nwidth = " + width + " \nheight= "+height + " \nweight=" +weight) ;
	 } 
}


