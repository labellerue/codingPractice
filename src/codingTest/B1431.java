package codingTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class B1431 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		List<String> arr = new ArrayList<String>(1001);
		
		for(int i=0 ; i<num ; i++){
			arr.add(sc.next());
		}
		
		//비교 커스터마이징
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()){
					return 1;
				}else if(o1.length() < o2.length()){
					return -1;
				//자리 수가 같다면
				}else{
					//char로 변환해 숫자인지 검사
					int o1Sum=0;
					int o2Sum=0;
					for(int i=0 ; i<o1.length() ; i++){
						if(o1.toCharArray()[i] >='0' && o1.toCharArray()[i] <='9'){
							o1Sum += o1.toCharArray()[i]-'0';
						}
						if(o2.toCharArray()[i] >='0' && o2.toCharArray()[i] <='9'){
							o2Sum += o2.toCharArray()[i]-'0';
						}
					}
					System.out.println("o1Sum= "+o1Sum);
					if(o1Sum == o2Sum){
						//기본 오름차순
						return o1.compareTo(o2);
					// 비교 기준으로 오름차순 구현
					}else if(o1Sum > o2Sum){
						return 1;
					}else{
						return -1;
					}
				}
			}
		};
		//정렬 시작
		Collections.sort(arr, comp);

		for(String a : arr){
			System.out.println(a);
		}
		
		sc.close();

	}

}
//comparator return값 사용법
//[오름차순 정렬시]
//인자로 전달된 obj가 작다면 1 반환
//인자로 전달된 obj가 크다면 -1 반환
//인자로 전달된 obj와 같다면 0을 반환
//
// 
//[내림차순 정렬시]
//인자로 전달된 obj가 작다면 -1 반환
//인자로 전달된 obj가 크다면 1 반환
//인자로 전달된 obj와 같다면 0을 반환
//https://jyami.tistory.com/11
