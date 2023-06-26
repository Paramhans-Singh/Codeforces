import java.util.Scanner;

public class Prob1426A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-->0){
    int n = s.nextInt();
    int x = s.nextInt();
    
    if(n==1 || n==2){
        System.out.println(1);
    }
   
    else{
      if(n%2==0){
        System.out.println(((n-2)/x)+1);
      }
      else{
        System.out.println(((n-2)/x)+2);
      }
    }

    }
    }
}
