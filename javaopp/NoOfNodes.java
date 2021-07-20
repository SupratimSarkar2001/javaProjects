package javaopp;

import java.util.LinkedList;

class GraphN{
	private int v;
	private LinkedList<Integer> [] adj;
	
	public GraphN(int ver) {
		v= ver;
		adj= new LinkedList[v];
		for(int i=0 ;i<adj.length;i++) {
			adj[i]= new LinkedList<>();
		}
	}
	
	void addEdge(int v,int w) {
		adj[v].add(w);
	}
	int BFS(int s, int l) {
		boolean visited[]= new boolean[v];
		int level[]= new int[v];
		LinkedList<Integer> queue= new LinkedList<>();
		visited[s]=true;
		queue.add(s);
		level[s]=0;
		while(!queue.isEmpty()) {
			s= queue.poll();
			LinkedList<Integer> list= adj[s];
			for(int i: adj[s]) {
				if(! visited[i]) {
					level[i]= level[s]+1;
					queue.add(i);
					visited[i]= true;
				}
			}
		}
		int count=0;
		for(int i: level) {
			if( i== l) {
				count++;
			}
		}
		return count;
	}
	
}

public class NoOfNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    GraphN g = new GraphN(6);
	    g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 3);
	    g.addEdge(2, 4);
	    g.addEdge(2, 5);
	    int level = 2;
	    System.out.println(g.BFS(0, level));
	}

}
