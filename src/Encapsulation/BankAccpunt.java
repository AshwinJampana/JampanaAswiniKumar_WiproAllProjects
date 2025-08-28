package Encapsulation;

class BankAccpunt {
	private double balance=0;
	public void deposit(double amt) 
	{
		if(amt>0) 
		{
			balance+=amt;
			System.out.println("Deposited Amount ="+amt);
		}
	}
	public void withdraw(double amt) 
	{
		if(amt>0 && amt<=balance) {
			balance-=amt;
			String d=amt+"";
			String n="";
			for(int i=0;i<d.length();i++) {
				if(d.charAt(i)>='0' && d.charAt(i)<='9') {
					n+="*";
				}
				else {
					n+=".";
				}
			}
			System.out.println("Withdraw amount="+n);
		}
		else {
			System.out.println("Invalid Amount");
		}
	}
	public double getbalance() {
		return balance;
	}
	public static void main(String[] args) {
		BankAccpunt ba=new BankAccpunt();
		ba.deposit(5000);
		ba.withdraw(2000.25);
		System.out.println("Current Balance is"+ba.getbalance());
		System.out.println();
		

	}

}
