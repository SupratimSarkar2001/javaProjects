package project1;

public class InsertionUnsorted {
	public static void Insertion(int[] arr,int n,int capacity,int k) {
		if(capacity>n) {
			arr[n]=k;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[20];
		arr[0]=1;
		arr[1]=18;
		arr[2]=9;
		arr[3]=6;
		arr[4]=3;
		int capacity=20;
		int n=5;
		Insertion(arr,n,capacity,12);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

		

	}

}
