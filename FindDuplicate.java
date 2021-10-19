package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

	public static void main(String[] args) {
int[] number= {23,56,72,68,35};
Set<Integer> setnum= new HashSet<Integer>();
for (int i = 0; i < number.length; i++) {
	setnum.add(number[i]);
}

int numarrlen = number.length;
int numarrlen1 =setnum.size();
System.out.println(numarrlen);
System.out.println(numarrlen1);
if(numarrlen==numarrlen1){System.out.println("no duplicate");}
else {System.out.println("duplicate");}

int[] number1= {23,56,72,68,35,56};
Set<Integer> setnum1= new HashSet<Integer>();
for (int i = 0; i < number1.length; i++) {
	setnum1.add(number1[i]);
	if(setnum1.add(number1[i])==false) {System.out.println("duplicate");
	break;};
	
	
}

}
}