package codingTest;

public class P_top {

	public static void main(String[] args) {
		int[] heights = {6,9,5,7,4};
//		int topNum = heights.length;
//		int[] answer = new int[topNum];
//		int i = topNum;
//		while(i>-1){
//			i--;
//			for(int j=i-1 ; j>-1 ; j--){
//				if(heights[j] > heights[i]){
//					answer[i] = j+1;
//					break;
//				}
//			}
//		}
		//모범답안
		int[] answer = new int[heights.length];

        for (int i=0; i<heights.length; i++){
            for (int j=i+1; j<heights.length; j++){
                if (heights[i] > heights[j]){
                    answer[j]=i+1;
                }
            }
        }

		for(int a : answer){
			System.out.print(a+", ");
		}
		
		
	}
}
