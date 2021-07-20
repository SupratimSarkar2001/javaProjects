package project1;

public class DeleteSorted {
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
 
        /*low + (high - low)/2;*/
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }
	public static int Delete(int[] arr,int n,int k) {
		int pos=binarySearch(arr, 0, n-1, k);
		 
        if (pos == -1) {
            System.out.println("Element not found");
            return n;
        }
		
		for(int i=pos;i<n-1;i++) {
			arr[i]=arr[i+1];
		}
		return n-1;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int n=6;
		int key=5;
		
		
		// TODO Auto-generated method stub
		int i;

        System.out.print("Array before deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
 
        n = Delete(arr,n,key);
 
        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

	}

}
