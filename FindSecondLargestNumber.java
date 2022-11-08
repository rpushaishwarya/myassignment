package week5.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> empty=new TreeSet<Integer>();
		for(int i=0;i<data.length-1;i++) {
			empty.add(data[i]);
		}
		List<Integer> largestNumber=new ArrayList<Integer>(empty);
		int size=largestNumber.size();
		System.out.println(size);
		
		Integer value=largestNumber.get(size-2);
		System.out.println(value);
	}

}
