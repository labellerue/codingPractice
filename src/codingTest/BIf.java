package codingTest;

import java.lang.*;
import java.util.Scanner;

public class BIf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println(compare(sc.nextInt(),sc.nextInt()));
//		System.out.println(score(sc.nextInt()));
//		System.out.println(yunnyeon(sc.nextInt()));
//		System.out.println(alarm(sc.nextInt(), sc.nextInt()));
		System.out.println(bigNumber(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		sc.close();
	}

	public static String compare(int a, int b){
		String giho = null;
		if(a > b){
			giho = ">";
		}else if(a < b){
			giho = "<";
		}else{
			giho = "==";
		}
		return giho;
	}
	
	public static String score(int a){
		String grade = null;
		if(a > 89){
			grade = "A";
		}else if(90>a && a>79){
			grade = "B";
		}else if(80>a && a>69){
			grade = "C";
		}else if(70>a && a>59){
			grade = "D";
		}else{
			grade = "F";
		}
		return grade;
	}
	
	public static int yunnyeon(int a){
		int tf = 0;
		
		if( a%4 < 1 && (a%100 > 0 || a%400 < 1) ){
			tf = 1;
		}
		
		return tf;
	}
	
	
	public static String alarm(int a, int b){
		if( b-45 < 0){
			if( a == 0 ){
				a = 23;
			}else{
				a = a-1;
			}
			b = 60+(b-45);
		}
		return a + " " + b;
	}
	
	public static int bigNumber(int a, int b, int c){
		if( (a>=b && a<=c) || (a>=c && a<=b ) ){
			return a;
		}else if( (b>=a && b<=c) || (b>=c && b<=a ) ){
			return b;
		}else if( (c>=a && c<=b) || (c>=b && c<=a ) ){
			return c;
		}
		return -1;
	}
	
	
	
	
	
	
	
}
