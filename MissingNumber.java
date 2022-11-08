package week5.day1;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	public static void main(String[] args) {
		int [] num= {1,2,5,7,8,10};
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<num.length;i++) {
			int j=i+1;
			if(j!=num[i]) {
				set.add(j);
				}
		}
		System.out.println(set);

	}

}
