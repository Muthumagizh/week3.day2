package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class NumIntersection {

	public static void main(String[] args) {

		int[] number1= {3,2,11,4,6,7};
		int[] number2= {1,2,8,4,9,7};
		Set<Integer> setnum1= new LinkedHashSet<Integer>();
		Set<Integer> setnum2= new LinkedHashSet<Integer>();
		for (int i = 0; i < number1.length; i++) {
			setnum1.add(number1[i]);
			setnum2.add(number2[i]);
			
		}
		
		System.out.println("set1"+setnum1);
		System.out.println("set2"+setnum2);
		for (Integer integer : setnum2) {
			//System.out.println(integer);
			//System.out.println(setnum1.add(integer));
						if (setnum1.contains(integer)==true) {
											
				setnum1.remove(integer);
				
			}
						
						
		}
		System.out.println("set1 after removing dup"+setnum1);
	}

}
