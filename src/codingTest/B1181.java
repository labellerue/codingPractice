package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		List<String> input = new ArrayList<String>(20001);
		for(int i=0 ; i<number ; i++){
			String word = sc.next();
			if(!input.contains(word)){
				input.add(word);
			}
		}
		
		//비교 커스터마이징
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()){
					return 1;
				}else if(o1.length() < o2.length()){
					return -1;
				}else{
					return o1.compareTo(o2);
				}
			}
		};
		//정렬 시작
		Collections.sort(input, comp);
		
		for(String a : input){
			System.out.println(a);
		}

		sc.close();
	}
	
}
