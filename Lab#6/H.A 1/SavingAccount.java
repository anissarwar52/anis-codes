package cons;

import java.util.Scanner;

public class SavingAccount {

	public static double annualInterestrate;
    private double savingsBalance;
    double A;
    public SavingAccount(){}
    public SavingAccount(double aI , double sB){
        annualInterestrate = aI;
        savingsBalance = sB;
    }
    public double calculateMonthlyInterest(){
        double monthlyInterest;
        monthlyInterest = (savingsBalance * annualInterestrate)/12;
        A = monthlyInterest;
        return A;
    }
    public double newBalance(){
        savingsBalance = A + savingsBalance;
        return savingsBalance;
    }
    public void setannualinterestrate(double a){
        annualInterestrate = a;
    }
    public double getannualinterestrate(){
        return annualInterestrate;
    }
    public static double modifyInterestRate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter new annual interest rate ");
        double d = sc.nextDouble();
        annualInterestrate = d;
        return annualInterestrate;
        
    }
}


