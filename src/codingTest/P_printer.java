package codingTest;


public class P_printer {
	public static void main(String[] args) {
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
		int[][] newP = new int[priorities.length][2];
		int[] temp;
		
		for(int i=0 ; i<priorities.length ; i++){
			newP[i][0] = priorities[i];
			newP[i][1] = i;
			System.out.print("�� : " + newP[i][0]);
			System.out.println(" �� : " + newP[i][1]);
		}
//		bubble sort
//		for(int i=0 ; i<priorities.length ; i++){
//			for(int j=0 ; j<priorities.length-1-i ; j++){
//				if(newP[j][0] < newP[j+1][0]){
//					temp = newP[j];
//					newP[j] = newP[j+1];
//					newP[j+1] = temp;
//				}
//			}
//		}
//		insert sort
		int j;
		for(int i=0 ; i<priorities.length-1 ; i++){
			j = i;
			//���� ������ ���� ���� �߰����� �� �˸��� �ڸ��� ã�� ������ �������� �ڸ��� �ٲ��ش�. 
			while(newP[j][0] < newP[j+1][0]){
				temp = newP[j];
				newP[j] = newP[j+1];
				newP[j+1] = temp;
				j--;
			}
		}
		
		int location = 0;
		for(int i=0 ; i<priorities.length ; i++){
				if(newP[i][1] == location){
//					System.out.println(i+1);
				}
		}
//		System.out.println(newP[0][1]);
		
		System.out.println("\n\n");
		for(int[] a : newP){
//			for(int b : a){
				System.out.print(a[1]+", ");
//			}
		}
		
	}

}
