public class circularRotateArray2 {
    public static void rotate(int[] arr, int n) {
        int i = 0;
        int j = n - 1;
        while (i != j) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
    }

    public static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        rotate(arr, 5);
        printArray(arr, 5);

    }

}
