package polymorphismAssignments;

public class AxisBank extends BankInfo {
	public void deposit() {
		super.deposit();
		System.out.println("The deposit amount in axis bank");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 AxisBank obj = new AxisBank();
 obj.deposit();
	}

}
