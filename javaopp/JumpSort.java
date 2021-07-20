package javaopp;

public class JumpSort {
	public static void sort(int[] arr, int k) {
		int steps=(int)Math.floor(Math.sqrt(arr.length));
		int currentLast=steps-1;
		while(currentLast<arr.length && k>arr[currentLast]) {
			currentLast+=steps;
		}
		for(int i=currentLast-steps+1;i<currentLast && i<arr.length;i++) {
			if(arr[i]==k) {
				System.out.println("the element is fount at: "+i);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		sort(arr,14);

	}

}
