package codingTest;

import java.util.*;

public class B10828 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int index = -1;
		int array[] = new int[num];
		String input;
		
		for(int i=0; i<num ; i++ ){
			input = sc.next();
			if(input.equals("push")){
				index++;
				array[index] = sc.nextInt();
			}else if(input.equals("pop")){
				if(index == -1){
					System.out.println(-1);
				}else{
					System.out.println(array[index]);
					index--;
				}
			}else if(input.equals("size")){
				System.out.println(index+1);
			}else if(input.equals("empty")){
				if(index == -1){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}else if(input.equals("top")){
				if(index == -1){
					System.out.println(-1);
				}else{
					System.out.println(array[index]);
				}
			}
		}
		sc.close();
	}
}
