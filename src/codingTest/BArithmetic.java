package codingTest;

public class BArithmetic {

	public static void main(String[] args){
//        System.out.println(calc1(7,3));
//        System.out.println(calc2(7,3));
//        System.out.println(calc3(7,3));
//        System.out.println(calc4(7,3));
//        System.out.println(calc5(7,3));
		
//        System.out.println(sol1(5,8,4));
//        System.out.println(sol2(5,8,4));
//        System.out.println(sol3(5,8,4));
//        System.out.println(sol4(5,8,4));
		int i = 1;
		int solution=threeNum(472,385, i);
		while(i<101){
			System.out.println(threeNum(472,385, i));
			if(i > 9){
				solution = solution+threeNum(472,385, i)*i;
			}
			i= i*10;
		}
		System.out.println(solution);
    }
    public static int calc1(int A, int B){
        return A+B;
    }
    public static int calc2(int A, int B){
    	return A-B;
    }
    public static int calc3(int A, int B){
    	return A*B;
    }
    public static long calc4(int A, int B){
    	return A/B;
    }
    public static int calc5(int A, int B){
    	return A%B;
    }
    
    public static int sol1(int A, int B, int C){
    	return (A+B)%C;
    }
    public static int sol2(int A, int B, int C){
    	return (A%C + B%C)%C;
    }
    public static int sol3(int A, int B, int C){
    	return (A*B)%C;
    }
    public static int sol4(int A, int B, int C){
    	return (A%C * B%C)%C;
    }
    
    public static int threeNum(int A, int B, int i){
//    	int num1;
//    	int num2;
//    	int num3;
//    	int i=1;
//    	num1 = A*((B%(10*1))/1);
//    	num2 = A*((B%(10*10))/10);
//    	num3 = A*((B%(10*100))/100);
    	return A*((B%(10*i))/i);
    }
    
}
