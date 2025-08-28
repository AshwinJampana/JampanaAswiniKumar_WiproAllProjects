package Assignment_Day5;
class BankAcc{
	private int acn;
	private String acname;
	private double balance;
	BankAcc(int acn,String acname,double balance){
		this.acn=acn;
		this.acname=acname;
		this.balance=balance;
	}
	void deposit(double amount) {
			amount=amount>0?amount:0;
			this.balance=balance+amount;
			System.out.println("Deposited Amount is"+amount);
	}
	boolean withdraw(double amount) {
		if(amount>balance) {
			return false;
		}
		else {
			this.balance-=amount;
			return true;
		}
	}
	void getbalance() {
		
		System.out.println("Balance is"+balance);
	}
	void displayDetils() {
		System.out.println("BankHolder name is"+acname);
		String d=acn+"";
		String n="";
		for(int i=0;i<d.length();i++) {
			if(d.charAt(i)>='0' && d.charAt(i)<='9') {
				n+="*";
			}
			else {
				n+=".";
			}
		}
		System.out.println("BankAccount AccountNumber is"+n);
		System.out.println("Balance  is "+balance);
	}
}
public class Bank_Account {
	public static void main(String args[]) {
		BankAcc b=new BankAcc(101,"RAM",200000);
		b.displayDetils();
		b.deposit(-50);
		System.out.println("Withdrawl status "+b.withdraw(400000));
	}
}
