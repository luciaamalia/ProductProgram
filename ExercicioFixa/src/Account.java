
public class Account {
	private int number; // nº da conta
	private String holder; // nome do titular
	private double balance; // saldo

	public Account(int number, String holder) {
		super();
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
		super();
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit); // metodo protegido
	}

	public void deposit(double amount) { // deposito
		balance += amount;
	}

	public void withdraw(double amount) { // saque
		balance -= amount + 5.0;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account "
				+ number
				+ ", holder: "
				+ holder 
				+ ", balance: $ "
				+ String.format("%.2f", balance) 
				;
	}

}