package kakao;

public class Kakao_2020_codingTest4 {

	public static int[] solution(String[] words, String[] queries) {
		int[] answer = new int [queries.length];
		int j=0;
		for(String query : queries){
			int matchingWordNum=0;
			for(String word : words){
				if(query.length() == word.length()){
					String[] queryArray = query.split("");
					String[] wordArray = word.split("");
					int i = 0;
					int matchingCharNum = 0;
					for(String q : queryArray){
						if(q.equals("?")){
							matchingCharNum++;
						}else if(q.equals(wordArray[i])){
							matchingCharNum++;
						}
						i++;
					}
					if(matchingCharNum == queryArray.length){
						matchingWordNum++;
					}
				}
			}
			answer[j] = matchingWordNum;
			j++;
		}
		for(int a : answer)
			System.out.println(a);
		return answer;
	}


	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		
		solution(words,queries );
	}
}
