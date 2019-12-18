package codingTest;

import java.util.Scanner;

public class C1714 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수를 입력하세요.");
		
		int num = sc.nextInt();
		do{
			System.out.print(num%10);
			num = num/10;
		}while(num > 0);
		
		
		sc.close();
	}
	

}
