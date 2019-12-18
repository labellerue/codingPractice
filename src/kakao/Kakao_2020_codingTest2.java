package kakao;

public class Kakao_2020_codingTest2 {

	public static String solution(String p) {
		String answer= "";
		String u= "";
		String v= "";
		String[] pArray = p.split("");
		int uNum = 0;
		int vNum = 0;
		do{
			u= "";
			for(int j=(uNum+vNum) ; j<pArray.length ; j++){
				String singleP= pArray[j];
				if(singleP.equals("(")){
					uNum++;
				}else if(singleP.equals(")")){
					vNum++;
				}
				u += singleP;
				if(uNum == vNum){
					if(u.startsWith(")")){
						String[] uArray = u.split("");
						for(String tmp : uArray){
							if(tmp.equals("(")){
								tmp = ")";
							}else{
								tmp = "(";
							}
							answer += tmp;
						}
					}else{
						answer = answer + u;
					}
					v="";
					for(int i=(uNum + vNum) ; i<pArray.length; i++){
						v += pArray[i];
					}
					break;
				}
			}
		}while(!v.equals(""));
		return answer;
	}


	public static void main(String[] args) {
		solution("(()())()");
		solution(")(");
		solution("()))((()");
		
	}
}
