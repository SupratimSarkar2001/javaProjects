package project1;

public class RotateMat180 {
	public static void rotate_mat(int[][] a, int n) {
		for(int i=n-1;i>=0;i--) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		rotate_mat(a,3);
		// TODO Auto-generated method stub

	}

}
