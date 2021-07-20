package javaopp;

import java.util.LinkedList;

class Graph{
	private int v;
	private LinkedList<Integer> adj[];
	public Graph(int ver){
		v=ver;
		adj= new LinkedList[v];
		for(int i=0;i< adj.length;i++) {
			adj[i]= new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w) {
		adj[v].add(w);
	}
	void BFS(int s) {
		boolean isVisited[]= new boolean[v];//by default they are false..
		
		LinkedList<Integer> queue= new LinkedList<>();
		isVisited[s]= true;
		
		queue.add(s);
		
		while(!queue.isEmpty()) {
			int current=queue.poll();
			System.out.print(current+" ");
			
			for(int i : adj[current]) {
				if(!isVisited[i]) {
					queue.add(i);
					isVisited[i]=true;
				}
			}
		}
		
	}
	
	
}

public class BFSGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Graph g= new Graph(4);
       
       g.addEdge(0, 1);
       g.addEdge(0, 2);
       g.addEdge(1, 2);
       g.addEdge(2, 0);
       g.addEdge(2, 3);
       g.addEdge(3, 3);
       
       
       System.out.println("the BFS of the graph from Starting point 2");
       
       g.BFS(2);
	}

}
