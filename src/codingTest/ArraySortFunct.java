package codingTest;

import java.util.Arrays;

public class ArraySortFunct {

	public static void main(String[] args) {
		Student students[] = {new Student("�̼���", 90), new Student("�̼Ұ�", 90), new Student("�̼ҳ�", 70), new Student("�̼Ҵ�", 60), new Student("�̼Ҷ�", 50)};
		Arrays.sort(students);
		
		for(Student st : students){
			System.out.println(st.getName() +" " + st.getScore());
		}
	}
}

class Student implements Comparable<Student>{
	
	String name;
	int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	/* ���� */
	@Override
	public int compareTo(Student o) {
		// ��������
		return o.getScore() - this.getScore();
		// ��������
//		return this.getScore() - o.getScore();
	}
	
	
}; 
