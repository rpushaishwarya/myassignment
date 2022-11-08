package week5.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {
	public static void main(String[] args) {
		String text="We learn java basics as part of java sessions in java week1";
		String[] split=text.split("");
		Set<String> emptyset=new TreeSet<String>();
		for(int i=0;i<text.length();i++) {
			emptyset.add(text);	
		}
		System.out.println(emptyset);
		
		
	}

}
