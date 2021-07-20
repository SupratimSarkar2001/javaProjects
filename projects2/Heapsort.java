package projects2;

public class Heapsort {
	
	void sort(int[] arr, int n) {
		for(int i=(n/2)-1 ;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>=0;i--) {
			int temp=arr[0];
			arr[0]= arr[i];
			arr[i]= temp;
			
			heapify(arr,i,0);
		}
	}
	void heapify(int[] arr, int n, int i) {
		int largest=i;
		int l=2*i+1;
		int r= 2*i+2;
		
		if(l<n && arr[l]> arr[largest]) {
			l= largest;
		}
		
		if(r<n && arr[r]> arr[largest]) {
			r= largest;
		}
		if(largest != i) {
			int swap= arr[i];
			arr[i]=arr[largest];
			arr[largest]=arr[i];
			
			heapify(arr,n ,largest);
		}
	}
	
	void print(int[] arr) {
		System.out.println("the heap sorted array is :");
		for(int i=0 ;i< arr.length;++i) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Heapsort h= new Heapsort();
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int n= arr.length;
		h.sort(arr,n);
		h.print(arr);

	}

}
