import java.util.Scanner;

public class Prob758A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    int arr[] = new int[t];
    int max = 0;
    int sum =0;
    if(t==1){
        System.out.println("0");
    }
    else{
     for(int i=0;i<arr.length;i++){
        arr[i] =s.nextInt();
        max= Math.max(max,arr[i]);
        sum+=arr[i];
    }
    int exp = max*arr.length;
    System.out.println(exp-sum);
    }
    
    }
}
