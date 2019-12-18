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
		
		//�� Ŀ���͸���¡
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() > o2.length()){
					return 1;
				}else if(o1.length() < o2.length()){
					return -1;
				//�ڸ� ���� ���ٸ�
				}else{
					//char�� ��ȯ�� �������� �˻�
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
						//�⺻ ��������
						return o1.compareTo(o2);
					// �� �������� �������� ����
					}else if(o1Sum > o2Sum){
						return 1;
					}else{
						return -1;
					}
				}
			}
		};
		//���� ����
		Collections.sort(arr, comp);

		for(String a : arr){
			System.out.println(a);
		}
		
		sc.close();

	}

}
//comparator return�� ����
//[�������� ���Ľ�]
//���ڷ� ���޵� obj�� �۴ٸ� 1 ��ȯ
//���ڷ� ���޵� obj�� ũ�ٸ� -1 ��ȯ
//���ڷ� ���޵� obj�� ���ٸ� 0�� ��ȯ
//
// 
//[�������� ���Ľ�]
//���ڷ� ���޵� obj�� �۴ٸ� -1 ��ȯ
//���ڷ� ���޵� obj�� ũ�ٸ� 1 ��ȯ
//���ڷ� ���޵� obj�� ���ٸ� 0�� ��ȯ
//https://jyami.tistory.com/11
