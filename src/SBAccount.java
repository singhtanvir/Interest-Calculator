import java.util.Scanner;

public class SBAccount extends Account{
	Scanner keyboardInput = new Scanner(System.in);

	public void mainMenu() {
		System.out.println("Enter the average amount in your account: ");
		amount = keyboardInput.nextInt();
		System.out.print("Enter Y|y if you are an NRI or N|n if you are not: ");
		String choice = keyboardInput.next();
		
		switch(choice) {
		case "Y":
		case "y":
			setInterestRate(6.00);
			calculateInterest();
			break;
			
		case "N":
		case "n":
			setInterestRate(4.00);
			calculateInterest();
			break;
			
		default:
			retry();
		}
	}
	public void retry() {
		System.out.println("Invalid choice entered! Press Y|y to Retry or N|n to Exit: ");
		String choice = keyboardInput.next();
		switch(choice) {
		case "Y":
		case "y":
			mainMenu();
			break;
			
		case "N":
		case "n":
			System.exit(0);
		}
	}
	@Override
	double calculateInterest() {
		double interestGained = (getAmount() * getInterestRate())/100;
		System.out.println("Interest gained is: Rs "+ interestGained);
		return 0;
	}
}
