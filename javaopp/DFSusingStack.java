package javaopp;

import java.util.LinkedList;
import java.util.Stack;

class Graph3{
	private int v;
	private LinkedList<Integer> adj[];
	
	public Graph3(int ver) {
		v= ver;
		adj= new LinkedList[v];
		for(int i=0 ;i<adj.length;i++) {
			adj[i]= new LinkedList<>();
		}
	}
	void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	void Dfs(int s) {
		boolean Visited[]= new boolean[v];
		
		Stack<Integer> st= new Stack<>();
		st.push(s);
		while(!st.isEmpty()) {
			int curr= st.peek();
			st.pop();
			
			if(Visited[curr]==false) {
				System.out.print(curr+" ");
				Visited[curr]=true;
			}
			
			for(int i: adj[curr]) {
				if(!Visited[i]) {
					st.push(i);
				}
			}
		}
	}
	
}
public class DFSusingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Graph3 g= new Graph3(6);
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
	        
	        System.out.println("the Dfs trversal of this graph is :");
	        
	        g.Dfs(0);

	}

}
