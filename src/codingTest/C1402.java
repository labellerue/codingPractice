package codingTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C1402 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		int i;
		for(i=0 ; i<num ; i++){
			list.add(sc.nextInt());
		}
		sc.close();
		while(i > 0){
			i--;
			System.out.print(list.get(i) + " ");
			
		}
		
	}
	
}
