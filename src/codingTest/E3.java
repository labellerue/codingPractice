package codingTest;

import java.util.Stack;

public class E3 {

	public static void main(String[] args) {
		boolean answer = true;
		
		String input = "3+{(5+1}";

		char inputChar;
		Stack<Character> stack = new Stack<Character>();

		for(int i=0 ; i<input.length() ; i++){
			inputChar = input.charAt(i);
			
			if(inputChar == '[' || inputChar == '{' || inputChar == '('){
				stack.push(inputChar);
				System.out.print(inputChar);
			}
			
			if(inputChar == ')'){
				if(stack.isEmpty() || stack.pop() != '(' ){
					answer = false;
				}
				break;
			}else if(inputChar == '}'){
				if(stack.isEmpty() || stack.pop() != '('){
					answer = false;
				}else{
					if(stack.isEmpty() && stack.pop() != '{'){
						answer = false;
					}
					
				}
				break;
			}else if(inputChar == ']'){
				if(stack.isEmpty() || stack.pop() != '(' ){
					answer = false;
				}else{
					if(stack.isEmpty() && stack.pop() != '{'){
						answer = false;
					}else{
						if(stack.isEmpty() && stack.pop() != '['){
							answer = false;
						}
					}
				}
				break;
			}
		}
		
		for(char a : stack){
			System.out.println(a);
		}
		System.out.println(answer);
		
	}
}
