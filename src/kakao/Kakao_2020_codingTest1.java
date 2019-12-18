package kakao;

public class Kakao_2020_codingTest1 {

	public static String[] solution(String s) {
		
		
		String[] answer = s.split("");
		
		for(String a : answer){
			System.out.println(a);
		}
//		int answer = 0;
		return answer;
	}

	
	
	
	
	
	public static void main(String[] args) {
		solution("aabbaccc");
	}
}
