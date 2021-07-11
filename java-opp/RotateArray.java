public class RotateArray {

    void leftRotate(int[] arr, int d,int n){
        for(int i=0;i<d;i++){
            leftRotateOneByOne(arr,n);
        }
    }
    void leftRotateOneByOne(int[] arr, int n){
        int temp;
        temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
    }
    void printArray(int[] arr, int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }




    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7};
        RotateArray obj=new RotateArray();
        obj.leftRotate(arr,2,7);
        obj.printArray(arr,7);
    }
    
}
