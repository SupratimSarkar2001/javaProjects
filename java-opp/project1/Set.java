package project1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Integer> hashset= new HashSet<>();
       //HashSet<Integer> hashset2= new HashSet<>();
       HashSet<Integer> hashset3= new HashSet<>();
       HashSet<Integer> hashset4= new HashSet<>();
       /*hashset.add(12);
       hashset.add(44);
       hashset.add(33);
       hashset.add(55);
       hashset.add(89);
       System.out.println(hashset.add(50));
       System.out.println(hashset);
       hashset.add(33);
       System.out.println(hashset.add(33));
       System.out.println(hashset);//main funda of a set is you can't use duplicate element;
       hashset.remove(44);
       System.out.println(hashset);
       System.out.println(hashset.isEmpty());
       System.out.println(hashset.contains(89));
       System.out.println(hashset.size());
       
       hashset2= (HashSet<Integer>) hashset.clone();
       System.out.println(hashset2);*/
       hashset.add(12);
       hashset.add(44);
       hashset.add(33);
       hashset.add(55);
       hashset.add(89);
       
       hashset3.add(89);
       hashset3.add(96);
       hashset3.add(52);
       hashset3.add(4);
       
       hashset4.add(89);
       
      // System.out.println(hashset.equals(hashset3));
       //union
       //hashset.addAll(hashset3);
       //System.out.println(hashset);
       //intersection..
       //hashset.retainAll(hashset3);
       //System.out.println(hashset);
       
      /* if(hashset3.containsAll(hashset4)) {
    	   System.out.println("hashset4 is a sub set of hashset 3");
       }*/
       
       // iteratot....
       
       /*Iterator<Integer> ir= hashset.iterator();
       while(ir.hasNext()) {
    	   System.out.println(ir.next());
       }*/
       
     /*  LinkedHashSet<String> lhs = new LinkedHashSet<>();
       
       lhs.add("spain");
       lhs.add("England");
       lhs.add("denmark");
       lhs.add("india");
       lhs.add("italy");
       System.out.println(lhs);*/
       
       
       TreeSet<Integer> ts= new TreeSet<>();
       ts.add(8);
       ts.add(9);
       ts.add(7);
       ts.add(1);
	   ts.add(5);
	   
	   System.out.println(ts);
	}

}
