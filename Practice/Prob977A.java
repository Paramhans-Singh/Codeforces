import java.util.Scanner;

public class Prob977A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    while(k-->0){
        int lastd = n%10;
        if(lastd!=0){
            n-=1;
        }
        else{
            n/=10;
        }
    }
    System.out.println(n);
    }
}
