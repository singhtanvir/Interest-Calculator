import java.util.Scanner;
public class FDAccount extends Account{

	int noOfDays, ageOfACHolder;
	Double general, seniorCitizen;
	final int limit = 10000000;;
	Scanner keyboardInput = new Scanner(System.in);
	
	private int getNoOfDays() {
		return noOfDays;
	}

	private void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	private int getAgeOfACHolder() {
		return ageOfACHolder;
	}

	private void setAgeOfACHolder(int ageOfACHolder) {
		this.ageOfACHolder = ageOfACHolder;
	}
	
	public void below1Crore() {
		
		System.out.println("Enter the number of days: ");
		noOfDays = keyboardInput.nextInt();
		
	if(getNoOfDays()<0) {
		retry();
	}
	else {

		if(getNoOfDays()>=7 && getNoOfDays()<=14) {
			
		System.out.println("Enter your age: ");
		ageOfACHolder = keyboardInput.nextInt();
		if(getAgeOfACHolder()<60) {
			setInterestRate(4.50);
		}
		else {
			setInterestRate(5.00);
		}
	}
		else if(getNoOfDays()>=15 && getNoOfDays()<=29) {
			
			System.out.println("Enter your age: ");
			ageOfACHolder = keyboardInput.nextInt();
			if(getAgeOfACHolder()<60) {
				setInterestRate(4.75);
			}
			else {
				setInterestRate(5.25);
			}
		}
		else if(getNoOfDays()>=30 && getNoOfDays()<=45) {
			
			System.out.println("Enter your age: ");
			ageOfACHolder = keyboardInput.nextInt();
			if(getAgeOfACHolder()<60) {
				setInterestRate(5.50);
			}
			else {
				setInterestRate(6.00);
			}
		}
		else if(getNoOfDays()>=45 && getNoOfDays()<=60) {
			
			System.out.println("Enter your age: ");
			ageOfACHolder = keyboardInput.nextInt();
			if(getAgeOfACHolder()<60) {
				setInterestRate(7.00);
			}
			else {
				setInterestRate(7.50);
			}
		}
		else if(getNoOfDays()>=61 && getNoOfDays()<=184) {
			
			System.out.println("Enter your age: ");
			ageOfACHolder = keyboardInput.nextInt();
			if(getAgeOfACHolder()<60) {
				setInterestRate(7.50);
			}
			else {
				setInterestRate(8.00);
			}
		}
		else if(getNoOfDays()>=185 && getNoOfDays()<=365) {
			
			System.out.println("Enter your age: ");
			ageOfACHolder = keyboardInput.nextInt();
			if(getAgeOfACHolder()<60) {
				setInterestRate(8.00);
			}
			else {
				setInterestRate(8.50);
			}
		}
		calculateInterest();
		}
	}
	public void above1Crore() {
		System.out.println("Enter noOfDays: ");
		noOfDays = keyboardInput.nextInt();
		
		if(getNoOfDays()>=7 && getNoOfDays()<=14) {
			setInterestRate(6.50);
		}
		else if(getNoOfDays()>=15 && getNoOfDays()<=29) {
			setInterestRate(6.75);
		}
		else if(getNoOfDays()>=30 && getNoOfDays()<=45) {
			setInterestRate(8.00);
		}
		else if(getNoOfDays()>=45 && getNoOfDays()<=60) {
			setInterestRate(8.50);
		}
		else if(getNoOfDays()>=61 && getNoOfDays()<=184) {
			setInterestRate(8.50);
		}
		else if(getNoOfDays()>=185 && getNoOfDays()<=365) {
			setInterestRate(10.00);
		}
		else {
			retry();
		}
	}
	public void mainMenu() {
		System.out.println("Enter the FD amount: ");
		amount = keyboardInput.nextInt();
		if(getAmount()<0) {
			retry();
		}
		else {
	if(getAmount()<limit) {
		below1Crore();
		}
	else if(getAmount()>=limit) {
		above1Crore();
	}
	else {
		retry();
		}
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
		System.out.println("Interest gained is: Rs "+interestGained);
		return 0;
	}
}
