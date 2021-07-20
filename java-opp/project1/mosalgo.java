package project1;
import java.util.*;


class Query{
	int L;
	int R;
	Query(int L,int R){
		this.L=L;
		this.R=R;
	}
}



public class mosalgo {
	static void QuerySum(int[] arr,int n,ArrayList<Query> q,int m) {
		for(int i=0;i<m;i++) {
			int l=q.get(i).L;
			int r=q.get(i).R;
			int Sum=0;
			for(int j=l;j<=r;j++) {
				Sum+=arr[j];
			}
			System.out.println("result: "+Sum );
		}

	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,45,6,7,8,9,10,11};
		int n=arr.length;
		ArrayList<Query> q = new ArrayList<Query>();
        q.add(new Query(0,4));
        q.add(new Query(1,3));
        q.add(new Query(2,4));
        
        int m=q.size();
        QuerySum(arr,n,q,m);
		
		
		
	}

}
