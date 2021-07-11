public class Polygon {
    void polygon(int n,char ch) {
    System.out.println("Square of side "+n+" :");
    for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
    System.out.print(ch+" ");
    }
    System.out.println("");
    }
    }
    void polygon(int x,int y) {
    System.out.println("Rectangle of length "+x+"and widht "+y+" :");
    for(int i=0;i<x;i++){
    for(int j=0;j<y;j++){
    System.out.print("@ ");
    }
    System.out.println("");
    }
    }
    void polygon() {
    System.out.println("Triangle : ");
    for(int i=0;i<3;i++){
    for(int j=0;j<=i;j++){
    System.out.print("*");
    }
    System.out.println("");
    }
    }
    public static void main(String[] args) {
    Polygon Poly1 = new Polygon();
    Poly1.polygon();
    Poly1.polygon(5,'$'); Poly1.polygon(4,6);
    }
   }