package bankDeposit;

public interface RBI {

	public static final double interest_rate = 6.5;
	public abstract void recurringDeposit(double amount, double time_period);
}
