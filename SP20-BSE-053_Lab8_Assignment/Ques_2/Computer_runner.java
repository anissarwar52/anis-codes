package cons_1;

public class Computer_runner {

	public static void main(String[] args) {
		Computer obj_1 = new Computer(4,6,2,1);
		System.out.println("      Computer");
		obj_1.display();
		Laptop obj_2 = new Laptop(1,4,4,3,1,6,5,7);
		System.out.println("      Laptop      ");
		obj_2.display();

	}
}
