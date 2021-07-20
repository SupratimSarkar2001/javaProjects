package javaopp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

class graphK{
	private int V;
	private LinkedList<Integer> adj[];
	
	public graphK(int ver) {
		V=ver;
		adj=new LinkedList[V];
		
		for(int i=0 ;i<V;i++) {
			adj[i]=new LinkedList<>();
		}
	}
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void fillTheStack(int i ,Stack<Integer> st, boolean[] visited) {
		visited[i]= true;
		
		for(int x : adj[i]) {
			if(!visited[x]) {
				fillTheStack(x,st,visited);
			}
		}
		st.push(i);
	}
	
	graphK GetTranspose() {
		graphK g = new graphK(V);
        for (int v = 0; v < V; v++)
        {
            // Recur for all the vertices adjacent to this vertex
            Iterator<Integer> i =adj[v].listIterator();
            while(i.hasNext())
                g.adj[i.next()].add(v);
        }
        return g;
		
	}
	void DfsUtil(boolean[] visited, int v) {
		visited[v]= true;
		System.out.print(v+" ");
		for(int i: adj[v]) {
			if(!visited[i]) {
				DfsUtil(visited,i);
			}
		}
	}
	
	void printSCC() {
		Stack<Integer> st= new Stack<>();
		
		// fill the stack according to the finishing time;
		boolean visited[]= new boolean[V];
		
		for(int i=0 ;i< V;i++) {
			if(!visited[i]) {
				fillTheStack(i,st,visited);
			}	
		}
		//transpose the graph--->
		
		graphK gr= GetTranspose();
		
		// call the DFS .....
		for(int i=0 ;i< visited.length;i++) {
			visited[i]=false;
		}
		while(!st.isEmpty()) {
			int v= st.pop();
			if(!visited[v]) {
				gr.DfsUtil(visited,v);
				System.out.println();
			}
		}
	}
}

public class SCC_Kosarajus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       graphK g = new graphK(5);
	        g.addEdge(1, 0);
	        g.addEdge(0, 2);
	        g.addEdge(2, 1);
	        g.addEdge(0, 3);
	        g.addEdge(3, 4);
	        System.out.println("the strongly connected componenet in this graph are:");
	        g.printSCC();

	}

}
