package project1;

import java.util.Arrays;

public class SortMatrix {
	
	public static void Sort(int[][] a, int n) {
		int temp[]=new int[n*n];
		int k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp[k++]=a[i][j];
			}
		}
		
		Arrays.sort(temp);
		k=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=temp[k++];
			}
		}
		
	}
	public static void printMat(int[][] a,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= {{4,5,6},{8,21,1},{9,74,2}};
		System.out.println("the given matrix:");
		printMat(a,3);
		Sort(a,3);
		System.out.println("the sorted matrix:");
		printMat(a,3);

	}

}
