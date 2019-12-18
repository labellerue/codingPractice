package codingTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10989 {
	
	public static void main(String[] args) throws IOException {
		
		//수 입력받기
		//scanner 사용시 시간 초과
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] array = new int[10001];
		int input;
		for(int i=0 ; i< num ; i++){
			input  = Integer.parseInt(br.readLine());
			array[input]++; //input 숫자와 같은 위치에 count해준다.
		}
		
		//수 출력하기
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0 ; i<10001 ; i++){
			while(array[i] != 0){
				bw.write(i+"\n");
				array[i]--; //count만큼 출력해준다.
			}
		}
		//주의!! sort로 풀면 안됨. 개수가 많아서 10,000,000 시간효율이 안나옴.(sort는 퀵정렬 기반)
		
		br.close();
		bw.close();
		
	}

}
