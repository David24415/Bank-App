import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char DoAgain=' ';
		int Selection=0;
		Scanner myVar = new Scanner(System.in);
		do{
System.out.println("*********************David & Co. Banking Solutions*****************\n");
//NewAccount myAcc= new NewAccount();
System.out.println("Welcome, please select one of the following:\n");

System.out.println("[1] Create new Account\n");
System.out.println("[2] Make a Deposit\n");
System.out.println("[3] Make a Withdrawal\n");
System.out.println("[4] transfer money to account\n");
System.out.println("[5] add user to account\n");

Selection=myVar.nextInt();

switch(Selection){
case 1: 
	NewAccount myAcc =new NewAccount();
	break;	
case 2: 
 Transaction trans= new Transaction();
 trans.Deposit();
	break;
case 3: 
	Transaction trans1= new Transaction();
	 trans1.Withdrawal();
	break;
case 4: 
	
	break;
case 5: System.out.println("Hello");
	
	break;
default:
System.out.println("inapplicable selection. Try again");
}
	

	



System.out.println("Would you like to make another Selection? 'y' or 'n' \n");
		DoAgain=myVar.next().charAt(0);
		}while(DoAgain=='y');
		}

}
