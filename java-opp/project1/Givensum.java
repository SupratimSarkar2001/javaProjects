package project1;

import java.util.Arrays;

public class Givensum {
	public static void FindtheElements(int[] arr, int sum) {
		Arrays.sort(arr);
		int l=0;
		int r=arr.length-1;
		while(l<r) {
			if(arr[l]+arr[r]==sum) {
				System.out.println("the elements are "+arr[l]+" & "+arr[r]);
			}
			if(sum>arr[l]+arr[r]) {
				r--;
			}
			l++;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,3,-4,-5,-6,7};
		int sum=-1;
		FindtheElements(arr,sum);
		
	}
}
	
