package hello;
import java.util.Scanner;

public class start5 {

	public static void main(String[]args){
		
		
		String account;
		String result;
		Scanner account_input = new Scanner(System.in);
		
		System.out.print("���¹�ȣ�� �����ָ� �Է��ϼ��� : ");
		account = account_input.next();
		result = account.substring(account.lastIndexOf(","+1));
				
		System.out.println(account);
		System.out.println(result);
		account_input.close();
	}

}
