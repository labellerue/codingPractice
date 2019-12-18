package codingTest;

import java.util.*;

public class One {

	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		solution(participant, completion);
		
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		for(String name : participant){
//			System.out.println(name);
//		}
//		System.out.println(".");
//		for(String name : completion){
//			System.out.println(name);
//		}
	}
	
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0 ; i<completion.length ; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
       
       return participant[i];
//        List<String> part = new ArrayList<String>();
//        List<String> comp = new ArrayList<String>();
//        for(String name : participant){
//        	part.add(name);
//        }
//        for(String name : completion){
//        	comp.add(name);
//        }
//        
//        for(int i=0 ; i<comp.size() ; i++){
//        	System.out.println("comp : " + comp.get(i));
//            for(int j=0 ; j<part.size() ; j++){
//            	System.out.println("part : " + part.get(j));
//                if(comp.get(i) == part.get(j)){
//                	comp.remove(i);
//                	part.remove(j);
//                	
//                }
//            }
//        }
//        for(String name : part){
//        	answer = name;
//        	System.out.println(answer);
//        }
//        return answer;
    }
	
	
}
