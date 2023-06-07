import java.util.Scanner;

public class Prob705A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    String ans="I hate ";

     for(int i=2;i<=n;i++){
        if(i%2==0){
         ans+="that I love ";
        }
        else{
            ans+="that I hate ";
        }
     }
     System.out.println(ans+" it");
    }
}
