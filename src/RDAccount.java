import java.util.Scanner;

public class RDAccount extends Account{
	Scanner keyboardInput = new Scanner(System.in);
	int noOfDays, ageOfACHolder;

	public int getNoOfDays() {
	return noOfDays;
}

public void setNoOfDays(int noOfDays) {
	this.noOfDays = noOfDays;
}

public int getAgeOfACHolder() {
	return ageOfACHolder;
}

public void setAgeOfACHolder(int ageOfACHolder) {
	this.ageOfACHolder = ageOfACHolder;
}

public void mainMenu() {
	System.out.println("Enter the RD amount: ");
	amount = keyboardInput.nextInt();
	if(amount<0) {
		retry();
	}
	else {
	System.out.println("Enter the number of days: ");
	noOfDays = keyboardInput.nextInt();
	
if(getNoOfDays()<0) {
	retry();
}
else {

	if(getNoOfDays()>=6 && getNoOfDays()<=6) {
		
	System.out.println("Enter your age: ");
	ageOfACHolder = keyboardInput.nextInt();
	if(getAgeOfACHolder()<60) {
		setInterestRate(7.50);
	}
	else {
		setInterestRate(8.00);
	}
}
	else if(getNoOfDays()>=9 && getNoOfDays()<=9) {
		
		System.out.println("Enter your age: ");
		ageOfACHolder = keyboardInput.nextInt();
		if(getAgeOfACHolder()<60) {
			setInterestRate(7.75);
		}
		else {
			setInterestRate(8.25);
		}
	}
	else if(getNoOfDays()>=12 && getNoOfDays()<=12) {
		
		System.out.println("Enter your age: ");
		ageOfACHolder = keyboardInput.nextInt();
		if(getAgeOfACHolder()<60) {
			setInterestRate(8.00);
		}
		else {
			setInterestRate(8.50);
		}
	}
	else if(getNoOfDays()>=15 && getNoOfDays()<=15) {
		
		System.out.println("Enter your age: ");
		ageOfACHolder = keyboardInput.nextInt();
		if(getAgeOfACHolder()<60) {
			setInterestRate(8.25);
		}
		else {
			setInterestRate(8.75);
		}
	}
	else if(getNoOfDays()>=18 && getNoOfDays()<=18) {
		
		System.out.println("Enter your age: ");
		ageOfACHolder = keyboardInput.nextInt();
		if(getAgeOfACHolder()<60) {
			setInterestRate(8.50);
		}
		else {
			setInterestRate(9.00);
		}
	}
	else if(getNoOfDays()>=21 && getNoOfDays()<=21) {
		
		System.out.println("Enter your age: ");
		ageOfACHolder = keyboardInput.nextInt();
		if(getAgeOfACHolder()<60) {
			setInterestRate(8.75);
		}
		else {
			setInterestRate(9.25);
		}
	}
	calculateInterest();
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
		System.out.println("Interest gained is: Rs "+ interestGained);
		return 0;
	}

}
