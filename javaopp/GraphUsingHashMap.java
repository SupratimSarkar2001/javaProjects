package javaopp;

import java.util.HashMap;
import java.util.TreeSet;

class GraphM{
	private int v;
	HashMap<Integer,TreeSet<Integer>> adj;
	public GraphM(int ver) {
		v=ver;
		adj= new HashMap<>();
        for(int i=0 ;i<=v;i++) {
        	adj.put(i, new TreeSet<>());
        }
	}
	
	public void addEdge(int v, int w) {
		adj.get(v).add(w);
		adj.get(w).add(v);
	}
	
	public void print() {
		for(int i=0;i<v;i++) {
			TreeSet<Integer> s=adj.get(i);
			System.out.println("for "+i);
			for(int i1:s) {
				System.out.print(i1+" ");
			}
			
			System.out.println();
		}
	}
	
	public void PathPresent(int src, int des) {
		if(adj.get(src).contains(des)) {
			System.out.println("present");
		}
		else {
			System.out.println("isn't present");
		}
	}
}

public class GraphUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphM graph = new GraphM(5);
		    graph.addEdge(0, 1);
		    graph.addEdge(0, 4);
		    graph.addEdge(1, 2);
		    graph.addEdge(1, 3);
		    graph.addEdge(1, 4);
		    graph.addEdge(2, 3);
		    graph.addEdge(3, 4);
		    graph.print();
		    
		    graph.PathPresent(1,40);
		    graph.PathPresent(2, 1);
		
	}

}
