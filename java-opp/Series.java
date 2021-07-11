class Ser{
    int x,n;
    Ser(int a ,int b){
        x=a;
        n=b;
    }
    int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;

    }
    double calc(){
        double sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+((-1)*(Math.pow(-1,i)*Math.pow(x,i)))/fact(i+1);
        }
        return sum;

    }
    public static void main(String[] args) {
        int a=1;
        int b=1;
        double result;
       Ser obj= new Ser(a,b);
       result=obj.calc();
       System.out.println("the sum of the series:"+result);

    }
}
