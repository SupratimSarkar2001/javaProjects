class circularRotateArray{
public static void rotate(int[] arr, int n){
    int temp,i;
    temp=arr[n-1];
    for(i=n-1;i>0;i--){
        arr[i]=arr[i-1];
    }
    arr[0]=temp;
}
public static void printArray(int arr[], int size) {
    int i;
    for (i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
}

    
public static void main(String[] args) {
    int[] arr={1,2,3,4,5};
    rotate(arr,5);
    printArray(arr, 5);
    
}
}