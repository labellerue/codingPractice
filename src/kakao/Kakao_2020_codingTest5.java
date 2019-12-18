package kakao;

import java.util.ArrayList;
import java.util.List;

public class Kakao_2020_codingTest5 {

	public static int[][] solution(int n, int[][] build_frame) {
		
		List<int[]> result = new ArrayList<int[]>();
		
		for(int i=0; i<build_frame.length ; i++){
			int[] a = {build_frame[i][0],build_frame[i][1],build_frame[i][2]} ;
//			for(int j=0; i<build_frame[i].length ; j++){
				// ���� �ٴڿ� ��ġ ����
				if(build_frame[i][1] == 0 && build_frame[i][2] == 1 ){
					break;
				}
				// ��ġ
				if(build_frame[i][3] == 1){
					int[][] tmp = {{build_frame[i][0],build_frame[i][1],0},{build_frame[i][0]+1,build_frame[i][1],0},{build_frame[i][0]-1,build_frame[i][1]-1,0},{build_frame[i][0]+1,build_frame[i][1],1}};
					// ���
					if(build_frame[i][2] == 0){
						// ����
						if(build_frame[i][1] > 0){
							// �Ʒ��� ���� ����� ������
							if(result.contains(tmp[0]) || result.contains(tmp[1])){
								result.add(a);
							}
							// �ٴ�
						}else if(build_frame[i][1] == 0){
							result.add(a);
						}
					// ��
					}else if(build_frame[i][2] == 1){
						// ����
						if(build_frame[i][1] > 0){
							// �Ʒ��� ����� ������
							if(result.contains(tmp[0]) || result.contains(tmp[1]) || result.contains(tmp[2])){
								result.add(a);
							// �Ʒ��� ���� ������
							}else if(result.contains(tmp[2]) && result.contains(tmp[3])){
								result.add(a);
							}
						}
					}
					//////////////////////////
					for(int[] b : result){
						System.out.print("{");
						for(int bb : b){
							System.out.print(bb+",");
						}
						System.out.print("}");
						System.out.println("");
					}
						
					//////////////////////////////
				// ����
				}else{
					int[][] tmp1 = {{build_frame[i][0],build_frame[i][1]+1,1},{build_frame[i][0]-1,build_frame[i][1]+1,0},{build_frame[i][0]+1,build_frame[i][1]+1,0},{build_frame[i][0],build_frame[i][1]+1,0}};
					int[][] tmp2 = {{build_frame[i][0]-1,build_frame[i][1],0},{build_frame[i][0],build_frame[i][1],0},{build_frame[i][0]+1,build_frame[i][1],0}};
					//���
					if(build_frame[i][2] == 0){
						if(result.contains(tmp1[0])){
							if(result.contains(tmp1[1]) || result.contains(tmp1[2])){
								result.remove(a);
							}
						}else if(!result.contains(tmp1[2])){
							result.remove(a);
						}
					// ��
					}else if(build_frame[i][2] == 1){
						if(result.contains(tmp2[0]) && result.contains(tmp2[1])){
							result.remove(a);
						}else if(result.contains(tmp2[1]) && result.contains(tmp2[2])){
							result.remove(a);
						}
					}
				}

//			}
		}
//		����� �ٴ� ���� �ְų� ���� ���� �� �κ� ���� �ְų�, �Ǵ� �ٸ� ��� ���� �־�� �մϴ�.
//		���� ���� �� �κ��� ��� ���� �ְų�, �Ǵ� ���� �� �κ��� �ٸ� ���� ���ÿ� ����Ǿ� �־�� �մϴ�
		
		int[][] answer = new int[result.size()][3];
		for(int i=0 ; i<result.size() ; i++){
			answer[i] = result.get(i);
			for(int dd : answer[i]){
				System.out.println(dd);
			}
		}
		
		return answer;
	}


	public static void main(String[] args) {
		int[][] build_frame = {{1,0,0,1},{1,1,1,1},{2,1,0,1},{2,2,1,1},{5,0,0,1},{5,1,0,1},{4,2,1,1},{3,2,1,1}};
		solution(6,build_frame);
//		
		
		
	}
}
