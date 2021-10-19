package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Set<Integer> setnum=new LinkedHashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			setnum.add(arr[i]);
		}
		for (int i = 1; i < arr.length; i++) {
			if(setnum.contains(i)==false){System.out.println(i);
			break;}
		}
}

}
