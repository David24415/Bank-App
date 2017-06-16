import java.util.Scanner;
public class Transaction {
	Scanner reader= new Scanner(System.in);
	double amount=0;
 void Deposit(){
	System.out.println("Enter the amount you would like to deposit \n");
	amount=reader.nextDouble();
	NewAccount.Balance+=amount;
}
void Withdrawal(){
	System.out.println("Enter the amount you would like to withdraw \n");
	amount=reader.nextDouble();
	NewAccount.Balance-=amount;
}
}


