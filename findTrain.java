package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findTrain {
public static void main(String[] args) {
	List<String> trnname = new ArrayList<String>();
	trnname.add("Trn4");
	trnname.add("Trn2");
	trnname.add("Trn2");
	trnname.add("Trn1");
	trnname.add("Trn3");
	Collections.sort(trnname);
	String lastbut1=trnname.get(trnname.size()-2);
	System.out.println(lastbut1);
	System.out.println(trnname.contains("Trn1"));
	trnname.remove("Trn1");
	System.out.println(trnname.contains("Trn1"));
	Collections.reverse(trnname);
	System.out.println(trnname);
}
}
