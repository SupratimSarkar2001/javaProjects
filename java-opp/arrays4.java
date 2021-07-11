public class arrays4 {
    public static void main(String[] args){
        int a[]={7,8,45,66,12};
        sum(a);
    }
    public static void sum(int[] a) {
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("the sum is:"+sum);
    }
    
}
