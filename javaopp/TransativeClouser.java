package javaopp;

import java.util.ArrayList;
import java.util.Arrays;

class GraphT{
	private int v;
	private int[][] mat;
	private ArrayList<Integer>[] adj;
	
	public GraphT(int ver){
		v=ver;
		mat= new int[v][v];
        adjutil();
	}
	
	public void adjutil() {
		adj= new ArrayList[v];
		for(int i=0 ;i<v;i++) {
			adj[i]= new ArrayList<>();
		}
		
	}
	
	public void addEdge(int v, int w) {
		adj[v].add(w);
	}
	
	public void transative() {
		for(int i=0;i<v;i++) {
			dfsutil(i,i);
		}
		
		for(int i=0 ;i<v ;i++) {
			System.out.println(Arrays.toString(mat[i]));
		}
	}
	
	
	public void dfsutil(int s,int v) {
		if( s==v) {
			if(adj[v].contains(v)) {
				mat[s][v]=1;
			}
		}
		else {
			mat[s][v]=1;
		}
		for(int adj : adj[v]) {
			if(mat[s][adj]==0)
			dfsutil(s,adj);
		}
	}
}
public class TransativeClouser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 GraphT g = new GraphT(4);
		    g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	        System.out.println("the transative Clouser of this garph is :");
	        
	        g.transative();
	}

}
