package javaopp;

import java.io.*;
import java.util.HashSet;

class GFG {
	public static void main (String[] args) {
		HashSet<Character> sset= new HashSet<>();
		HashSet<Character> tset= new HashSet<>();
		
		sset.add('a');
		sset.add('b');
		sset.add('c');
		tset.add('a');
		tset.add('b');
		tset.add('c');
		tset.add('d');
		
		tset.retainAll(sset);
		
		System.out.println(tset);
		
		
	}
}
