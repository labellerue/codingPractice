package codingTest;

import java.util.Arrays;

public class ArraySortFunct {

	public static void main(String[] args) {
		Student students[] = {new Student("이소형", 90), new Student("이소가", 90), new Student("이소나", 70), new Student("이소다", 60), new Student("이소라", 50)};
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
	
	/* 정렬 */
	@Override
	public int compareTo(Student o) {
		// 내림차순
		return o.getScore() - this.getScore();
		// 오름차순
//		return this.getScore() - o.getScore();
	}
	
	
}; 
