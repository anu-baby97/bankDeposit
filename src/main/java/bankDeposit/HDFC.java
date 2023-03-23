package bankDeposit;

public class HDFC implements RBI {
	
	public void recurringDeposit(double amount, double time_period) {
		double final_amount = amount * (1+(interest_rate/100)*time_period);
		System.out.println("Final amount obtained after depositing for "+ time_period+ " years: "+final_amount);
	}

	public static void main(String[] args) {
		RBI obj = new HDFC();
		obj.recurringDeposit(6000,2 );

	}

}
