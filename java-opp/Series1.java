public class Series1 {
    long fact(int x) {
        long f = 1;
        for (long i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }

    void sumSeries1(int x, int n) {
        double sum = 0.0d;
        for (int i = 1; i <= n; i++) {
            sum += x / fact(i);
        }
        System.out.println("Sum of Series is " + sum);
    }

    void sumSeries2(int x, int n) {
        double sum = 0.0d;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x,i) / fact(i+1);
        }
        System.out.println("Sum of Series is " + sum);
    }
    void sumSeries3(int x, int n){
        double sum=0.0d;
        for(int i=1;i<=n;i++){
        sum+=(Math.pow(-1,i+1)*(Math.pow(x,i+1)/fact(i+2)));
        }
        System.out.println("Sum of Series is "+sum);
        }
        public static void main (String args[]){
            Series1 obj=new Series1();
            obj.sumSeries1(2,5);
            obj.sumSeries2(1,5);
            obj.sumSeries3(7,9);
            }

}
