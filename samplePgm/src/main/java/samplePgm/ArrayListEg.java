package samplePgm;

import java.util.ArrayList;

public class ArrayListEg {
	public static void main(String args[]) {
		//ArrayList<Integer>s=new ArrayList<Integer>();
	ArrayList<String> ar=new ArrayList<String>();
	ar.add("blue");
	ar.add("green");
	System.out.println(ar);
	ar.add(1,"red");
	System.out.println(ar);
	ar.remove(0);
	System.out.println(ar);
	ar.add("orange");
	ar.add("pink");
	System.out.println(ar);
	//System.out.println(ar.size());
	
	for(int i=0;i<ar.size();i++) {
		if(ar.get(i)=="orange") {
			System.out.println("Found");
		}
	
	
	}
}
}