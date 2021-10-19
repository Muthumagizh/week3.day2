package week3.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesstring {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
	String[] strarr=text.split(" ");
	
	Set<String> lststr=new LinkedHashSet<String>();
	for (int i = 0; i < strarr.length; i++) {
				if(lststr.add(strarr[i])==false){
			lststr.add(" ");
		}
		else {lststr.add(strarr[i]);}
		
	}
	System.out.println(lststr);
	}

}
