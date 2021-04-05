package cons;

public class SavingAccount_runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount saver1 = new SavingAccount(3,2000);
        SavingAccount saver2 = new SavingAccount(3,3000);
        System.out.println("Monthly Interest on saver 1 with 3% annual interest rate:"+saver1.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 1 with 3% annual interest rate: "+saver1.newBalance());
        System.out.println("Monthly Interest on saver 2 with 3% annual interest rate:"+saver2.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 2 with 3% annual interest rate: "+saver2.newBalance());

        saver1.setannualinterestrate(4);
        saver2.setannualinterestrate(4);
        
        System.out.println("Monthly Interest on saver 1 with 4% annual interest rate:"+saver1.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 1 with 4% annual interest rate: "+saver1.newBalance());
        System.out.println("Monthly Interest on saver 2 with 4% annual interest rate:"+saver2.calculateMonthlyInterest());
        System.out.println("The new Savingsbalance of saver 2 with 4% annual interest rate: "+saver2.newBalance());
	}

}
