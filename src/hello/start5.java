package hello;
import java.util.Scanner;

public class start5 {

	public static void main(String[]args){
		
		
		String account;
		String Nunber;
		int am;
		Scanner account_input = new Scanner(System.in);
		Scanner amount = new Scanner(System.in);
		
		System.out.print("(���¹�ȣ,������)�� �Է��ϼ��� : ");
		account = account_input.next();
		
		Nunber = account.substring(0,account.indexOf(","));
		account = account.substring(account.indexOf(",")+1);
		
		//System.out.println(Nunber);
		//System.out.println(account);
		
		System.out.print("�Ա��Ͻ� �ݾ׸� �Է��ϼ��� : ");
		am = amount.nextInt();
		
		BankAccount db = new BankAccount(Nunber, account, am);
		db.printStatus();
		db.deposit(20000);
		db.withDraw(45000);
		
		
		
		account_input.close();
	}

}
