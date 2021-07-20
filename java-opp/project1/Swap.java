package project1;

import java.util.Scanner;
class Question { 
Scanner sc = new Scanner(System.in);
int e1 = sc.nextInt();
int e2 = sc.nextInt(); 
}
public class Swap {
public static void swap(Question t) {
int temp = t.e1;
t.e1 = t.e2;
t.e2 = temp;
}
public static void main(String[] args) {
Question t = new Question();

swap(t);
System.out.println(t.e1+" "+ t.e2);
}
}


