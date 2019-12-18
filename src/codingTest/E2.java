package codingTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class E2 {
	public static void main(String[] args) {
		
		long n = 1234L;
		long num = n;
		Set<Long> set = new HashSet<Long>();
		
		do{
			if(num%10 == 0){
				num = num/10;
			}else{
				set.add(num%10);
				num = num/10;
			}
		}while(num > 0);
		
		Long setNum;
		List<Long> erase = new ArrayList<Long>();
		Iterator<Long> it = set.iterator();
		while(it.hasNext()){
			setNum = it.next();
			if(n%setNum > 0){
				erase.add(setNum);
			}
		}
		
		set.removeAll(erase);
		System.out.print(set.size());
		
		
//		for(long a : set){
//			System.out.print(a);
//		}
//		System.out.print("\n");
//		
//		
//		for(long a : set){
//			System.out.println(a);
//		}
		
	}

}
