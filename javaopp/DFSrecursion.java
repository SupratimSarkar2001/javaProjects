package javaopp;

import java.util.LinkedList;

class Graph2{
	private int v;
	private LinkedList<Integer> adj[];
	public Graph2(int ver) {
		v= ver;
		adj=new LinkedList[v];
		for(int i=0 ;i< adj.length;i++) {
			adj[i]= new LinkedList<>();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	//we gonna do dfs in this graph using recursion
	void dfsutil(int s, boolean[] Visited) {
		Visited[s]= true;
		System.out.print(s+" ");
		
		for(int i: adj[s]) {
			if(!Visited[i]) {
				dfsutil(i,Visited);
			}
		}
	}
	void dfs(int s) {
		boolean Visited[]= new boolean[v];
		dfsutil(s,Visited);
	}
}
public class DFSrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Graph2 g= new Graph2(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 0);
        g.addEdge(1, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 3);
        g.addEdge(5, 3);
        
        System.out.println("the dfs of this graph is >>>>");
        g.dfs(0);
	}

}
