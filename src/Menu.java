import java.util.Scanner;

public class Menu {
	int choice;
	Scanner keyboardInput = new Scanner(System.in)
			;
public void mainMenu() {
	
do{
	System.out.println("");//simple black space
	System.out.println("MAIN MENU");
	System.out.println("=========");
	System.out.println("");//simple black space
	System.out.println("1. Interest Calculator - SB ");
	System.out.println("2. Interest Calculator - FD ");
	System.out.println("3. Interest Calculator - RD ");
	System.out.println("4. Exit ");
	System.out.print("Enter your option (1...4): ");
	choice = keyboardInput.nextInt();
	
	switch(choice) {
	case 1:
		SBAccount obj = new SBAccount();
		obj.mainMenu();
		break;
	case 2:
		FDAccount obj1 = new FDAccount();
		obj1.mainMenu();
		break;
	case 3:
		RDAccount obj2 = new RDAccount();
		obj2.mainMenu();
		break;
	case 4:
		System.exit(0);
		break;
	default:
		retry();
		
	}
}while(choice!=1 || choice!=2 || choice!=3 ||choice!=4);
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
public static void main(String[] args) {
	try{
		Menu obj = new Menu();
	obj.mainMenu();
	}catch(Exception e) {
		System.out.println("User defined exception!");
	}
}
}
