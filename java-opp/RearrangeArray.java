public class RearrangeArray {
    public static void fixarray(int[] arr, int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[j]==i){
                    int temp;
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    break;

                }
          }
        }  
        for(int i=0;i<n;i++){
              if(arr[i] !=i){
                  arr[i]=-1;
              }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        
    }
    public static void main(String[] args) {
        int arr[]={12,0,1,4,2,3,5,6,7,8,44,55,69,21,};
        int n=arr.length;
        fixarray(arr,n);
        
    }
    
}
