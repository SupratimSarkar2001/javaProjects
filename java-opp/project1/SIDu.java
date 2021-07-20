package project1;

public class SIDu {
	public static void Search(int[] arr, int key){
		int index=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==key) {
				
				index=i;
			}
			
		}
		if(index>=0) {
			System.out.println("found at:"+(index+1));
			
			
		}
		if(index==-1) {
		System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int key=8;
		Search(arr,key);
		
		
		

	}

}
