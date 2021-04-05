package cons;

public class Calculator {		
	  public static double val1;
	  public static double val2;
	 
	  public static void Sum(){
	      double sum=val1+val2;
	      System.out.println( "The Sum of two numbers is: "+sum);
	  }
	  public static void  Multiply(){
	      double multiply=val1*val2;
	      System.out.println("The multiplication of two numbers is: "+multiply);
	  }
	  public static void Divide() {
	      double divide=val1 / val2;
	      System.out.println("The division of two numbers is: "+divide);
	  } 
	  public static void Modulus (){
	      double modulus=val1 % val2;
	      System.out.println("The modulus of two numbers is: "+modulus);
	  } 
	  public static void Tan (){
	      double tan_val1=Math.tan(val1);
	      double tan_val2=Math.tan(val2);
	      System.out.println("Tan of value 1: "+tan_val1+"\n"+"Tan of value 2:"+tan_val2);
	  } 
	  public static void Sin (){
	      double sin_val1=Math.sin(val1);
	      double sin_val2=Math.sin(val2);
	      System.out.println("Sin of value 1 : "+sin_val1+"\n"+"Sin of value 2: "+sin_val2);
	  } 
	  public static void Cos(){
	       double cos_val1=Math.cos(val1);
	       double cos_val2=Math.cos(val2);
	       System.out.println("Cos  of value 1:"+cos_val1+"\n"+"Cos of value 2: "+cos_val2);
	  } 	  
	}


