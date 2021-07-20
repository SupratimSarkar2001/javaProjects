package projects2;

public class MaxHeap {
	
	void heapify(int[] arr, int n, int i) {
		int largest= i;
		int l= 2*i+1;
		int r= 2*i+2;
		
		if( l<n && arr[largest]<arr[l]) {
			largest=l;
		}
		if( r<n && arr[largest]<arr[r]) {
			largest=r;
		}
		
		// after checking that the root is larger on not ...
		if( i!= largest) {
			int swap= arr[largest];
			arr[largest]= arr[i];
			arr[i]= swap;
			
			
			heapify(arr,n,largest);
		}
	}
     void buildheap(int[] arr, int n) {
    	 // find out the leaf non_leaf node;
    	 
    	 int start_indx= (n/2)-1;
    	 for(int i= start_indx;i>=0; i--) {
    		 heapify(arr,n,i);
    	 }
     }
     
     // function of print heap....
      void printheap(int[] arr,int n) {
    	  System.out.println("the max heap is ......");
    	  for(int i=0 ;i< n-1;i++) {
    		  System.out.print(arr[i]+" ");
    	  }
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxHeap h= new MaxHeap();
		int arr[] = { 1, 3, 5, 4, 6, 13, 10,
                9, 8, 15, 17 };
		int n= arr.length;
		h.buildheap(arr,n);
		h.printheap(arr,n);
		
	}

}
