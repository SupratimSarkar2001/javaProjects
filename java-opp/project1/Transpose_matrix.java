package project1;

public class Transpose_matrix {
	public static void transpose(int[][] a,int n) {
		int temp;
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		transpose(a,3);

	}

}
