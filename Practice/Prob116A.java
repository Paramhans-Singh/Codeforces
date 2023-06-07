import java.util.Scanner;

public class Prob116A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int capacity =0;
    int remain=0;
    while(n-->0){
     int exit =s.nextInt();
     remain-=exit;
     int enter=s.nextInt();
     remain+=enter;

     capacity=Math.max(capacity,remain);
    }
    System.out.println(capacity);
    }
}
