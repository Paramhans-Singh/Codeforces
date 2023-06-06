import java.util.Scanner;

public class Prob231A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    int ans=0;
    while(t-->0){
        int count1=0;
       for(int i=0;i<3;i++){
        int a = s.nextInt();
        if(a==1){
            count1++;
        }
       }
       if(count1>=2){
        ans++;
       }
    }
    System.out.println(ans);
    }
    }
        