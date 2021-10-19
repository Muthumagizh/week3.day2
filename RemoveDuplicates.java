package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
String name="PayPal";
char[] charname=name.toCharArray();
Set<Character> charset=new HashSet<Character>();
Set<Character> dupcharset=new HashSet<Character>();
charset.add(charname[1]);

for (int i= 0;  i< charname.length; i++) {
	if (charset.add(charname[i])==true) {
		charset.add(charname[i]);
	} else {
		dupcharset.add(charname[i]);
	}
	}
System.out.println(charset);
System.out.println(dupcharset);
for (Character character : dupcharset) {
	
	 	
	 	if(charset.add(character)==false) {
	 		charset.remove(character);
	 	}
		
	}
		

System.out.println("charset after removing duplicate" +charset);
	
	
	}
}
