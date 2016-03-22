//subclass or child class or derived class
public class JuniorSavingsAccount extends SavingsAccount{
	
	String guardianName,name;
	
	public JuniorSavingsAccount() {
		//super();	
	}

	public JuniorSavingsAccount(int accountNo, float balance, String status, int pin, String guardianName, String name) {
		super(accountNo, balance, status, pin);
		this.guardianName = guardianName;
		this.name = name;
	}
	
		public void display(){
			System.out.println("Name        :"+this.name);
			System.out.println("Account No  :"+super.accountNo);
			System.out.println("Status      :"+super.status);
			System.out.println("Balance     :"+super.balance);
			System.out.println("Pin         :"+super.pin);
			System.out.println("Guardian    :"+guardianName);
		}
}
