package cons;

public class CountObject_runner {

	public static void main(String[] args) {
		CountObject obj1 = new CountObject();
        CountObject obj2 = new CountObject(31);
        CountObject obj3 = new CountObject(41);
        CountObject obj4 = new CountObject(25);
        CountObject obj5 = new CountObject(90);
        System.out.println("The total number of objects created are: " + obj1.totalObjects());
    }

}
		
    
	