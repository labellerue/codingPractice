package kakao;

import java.util.ArrayList;
import java.util.List;

public class Kakao_2020_codingTest5 {

	public static int[][] solution(int n, int[][] build_frame) {
		
		List<int[]> result = new ArrayList<int[]>();
		
		for(int i=0; i<build_frame.length ; i++){
			int[] a = {build_frame[i][0],build_frame[i][1],build_frame[i][2]} ;
//			for(int j=0; i<build_frame[i].length ; j++){
				// 보는 바닥에 설치 못함
				if(build_frame[i][1] == 0 && build_frame[i][2] == 1 ){
					break;
				}
				// 설치
				if(build_frame[i][3] == 1){
					int[][] tmp = {{build_frame[i][0],build_frame[i][1],0},{build_frame[i][0]+1,build_frame[i][1],0},{build_frame[i][0]-1,build_frame[i][1]-1,0},{build_frame[i][0]+1,build_frame[i][1],1}};
					// 기둥
					if(build_frame[i][2] == 0){
						// 공중
						if(build_frame[i][1] > 0){
							// 아래에 보나 기둥이 있으면
							if(result.contains(tmp[0]) || result.contains(tmp[1])){
								result.add(a);
							}
							// 바닥
						}else if(build_frame[i][1] == 0){
							result.add(a);
						}
					// 보
					}else if(build_frame[i][2] == 1){
						// 공중
						if(build_frame[i][1] > 0){
							// 아래에 기둥이 있으면
							if(result.contains(tmp[0]) || result.contains(tmp[1]) || result.contains(tmp[2])){
								result.add(a);
							// 아래에 보가 있으면
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
				// 제거
				}else{
					int[][] tmp1 = {{build_frame[i][0],build_frame[i][1]+1,1},{build_frame[i][0]-1,build_frame[i][1]+1,0},{build_frame[i][0]+1,build_frame[i][1]+1,0},{build_frame[i][0],build_frame[i][1]+1,0}};
					int[][] tmp2 = {{build_frame[i][0]-1,build_frame[i][1],0},{build_frame[i][0],build_frame[i][1],0},{build_frame[i][0]+1,build_frame[i][1],0}};
					//기둥
					if(build_frame[i][2] == 0){
						if(result.contains(tmp1[0])){
							if(result.contains(tmp1[1]) || result.contains(tmp1[2])){
								result.remove(a);
							}
						}else if(!result.contains(tmp1[2])){
							result.remove(a);
						}
					// 보
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
//		기둥은 바닥 위에 있거나 보의 한쪽 끝 부분 위에 있거나, 또는 다른 기둥 위에 있어야 합니다.
//		보는 한쪽 끝 부분이 기둥 위에 있거나, 또는 양쪽 끝 부분이 다른 보와 동시에 연결되어 있어야 합니다
		
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
