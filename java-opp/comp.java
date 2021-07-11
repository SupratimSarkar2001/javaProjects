public class comp {
 void compare(int a,int b){
 int max = a>b ? a : b;
 System.out.println("Greater value is "+max);
 }
 void compare(char a,char b){
 int aNum = (int) a;
 int bNum = (int) b;
 if(aNum>bNum){
 System.out.println(a+" has greater numeric value!");
 }
 else if(bNum>aNum){
 System.out.println(b+" has greater numeric value!");
 }
 else {
 System.out.println("Both have same numeric value!");
 }
 }
 void compare(String a,String b){
 if(a.length()>b.length()){
 System.out.println(a);
 }
 else {
 System.out.println(b);
 }
 }
 public static void main(String[] args) {
 comp value = new comp();
 value.compare("Supratim", "Shrestha");
 System.out.println("");
 value.compare('k', 's');
 System.out.println("");
 value.compare(345, -23);
 System.out.println(""); }
}