class RotateArray3 {

    public static void rotate(int[] arr,int d, int n){
        int i,j,temp;
        if(d==0 || d==n){
            return;
        }        
        i=d;
        j=n-d;
        while(i!=j){
            if(i<j){
                swap(arr,d-i,d-i+j,i);
                j=j-i;
            }
            else{
                swap(arr,d-i,d,j);
                i=i-j;

            }

            

        }


    }

    public static void swap(int[] arr, int fi, int si,int d){
        int temp;
        for(int i=0;i<d;i++){
            temp=arr[i+fi];
            arr[i+fi]=arr[i+si];
            arr[i+si]=temp;
        }
    }
    public static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        rotate(arr,2,7);
        printArray(arr, 7);
    }

}