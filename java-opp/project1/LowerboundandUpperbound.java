package project1;

public class LowerboundandUpperbound {
	public static void lower(int[][] a,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i>j) {
					a[i][j]=0;
				}
			}
		}
	}
	public static void upper(int[][] b,int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i<j) {
					b[i][j]=0;
				}
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
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b= {{1,2,3},{4,5,6},{7,8,9}};
		lower(a,3);
		System.out.println("lower bound: ");
		printMat(a,3);
		upper(b,3);
		System.out.println("upper bound: ");
		printMat(b,3);

	}

}
