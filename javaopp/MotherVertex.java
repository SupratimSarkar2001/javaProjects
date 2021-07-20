package javaopp;

import java.util.ArrayList;

public class MotherVertex {
	
	static void addEdge(int v, int w,ArrayList<ArrayList<Integer>> adj ) {
		adj.get(v).add(w);
	}
	static void DFSutil(int i, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
		visited[i]= true;
		for(int x: adj.get(i)) {
			DFSutil(x,adj,visited);
		}
	}
	static int MotherVertexFind(ArrayList<ArrayList<Integer>> adj,int V) {
		boolean visited[]= new boolean[V];
		int ver =-1;
		
		for(int i=0;i<V;i++) {
			if(!visited[i]) {
			DFSutil(i,adj,visited);
			ver=i;
			}
		}
		
		boolean check[]= new boolean[V];
		DFSutil(ver,adj,check);
		for(boolean x: check) {
			if(!x) {
				return -1;
			}
		}
		return ver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int V=7;
		ArrayList<ArrayList<Integer>> adj= new ArrayList<ArrayList<Integer>>();
		for(int i=0 ;i<V;i++) {
			adj.add(new ArrayList<Integer>());
		}
	    addEdge(0, 1,adj);
	    addEdge(0, 2,adj);
	    addEdge(1, 3,adj);
	    addEdge(4, 1,adj);
	    addEdge(6, 4,adj);
	    addEdge(5, 6,adj);
	    addEdge(5, 2,adj);
	    addEdge(6, 0,adj);
	    
	    System.out.println("Mother vertix is:"+MotherVertexFind(adj,V));
	}

}
