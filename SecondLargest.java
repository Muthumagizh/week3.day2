package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7};
		List<Integer> setnum1= new ArrayList<Integer>();
		for (int i = 0; i < data.length; i++) {
			setnum1.add(data[i]);
		}
		int sizeofset=setnum1.size();
		System.out.println("second largest "+setnum1.get(sizeofset-1));
	}

}
