package kakao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Kakao_codingTest {

	public static String[] solution(String[] record) {

		Map<String,String> id_nicknameMap = new HashMap<String, String>();
		List<String[]> recordArray = new LinkedList<String[]>();

		// ������� ���̵�� �ֱ� �г��Ӱ� ��Ī
		for(String splitIt : record){
			String[] id_nickname = splitIt.split(" ");
			// ���ο� �г������� ����
			if( id_nickname[0].equals("Enter")){
				id_nicknameMap.put(id_nickname[1],id_nickname[2]);
				recordArray.add(id_nickname);
				System.out.println(id_nickname.toString());
			}else if(id_nickname[0].equals("Change")){
				id_nicknameMap.put(id_nickname[1],id_nickname[2]);
			}else{
				recordArray.add(id_nickname);
				System.out.println(id_nickname);
			}
		}
		String[] answer = new String[recordArray.size()];
		// record�� ���̵�� ��Ī�� �г��Ӱ� ���� ��Ī�Ͽ� result ����
		for(int i=0 ; i<recordArray.size() ; i++){
			String[] tmp = recordArray.get(i); 
			if(tmp[0].equals("Enter")){
				answer[i] = id_nicknameMap.get(tmp[1]) + "���� ���Խ��ϴ�.";
			}else if(tmp[0].equals("Leave")){
				answer[i] = id_nicknameMap.get(tmp[1]) + "���� �������ϴ�.";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(solution(record));
	}

}
