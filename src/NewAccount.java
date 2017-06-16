import java.util.Random;
import java.util.Scanner;

 class NewAccount {
	Scanner MySc=new Scanner(System.in);
	Random randomNum = new Random();
	private String FirN, LasN;
	private String AccType;
	private int AccNum =0;
	static Double Balance=0.00;
	
	public NewAccount(){
		System.out.println("Please enter the first name for new Acc\n ");
		FirN= MySc.next();
		
		System.out.println("Please enter the Last name for new Acc\n");
		LasN =MySc.next();
		
		System.out.println("Please enter the Acc Type (savings or checking) for new Acc\n ");
		AccType = MySc.next();
		
		AccNum=randomNum.nextInt((9999999) + 0000000);
		System.out.println(AccNum);
	}
}
