import java.util.Arrays;
import java.util.Scanner;

public class Prob1760A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-->0){
    int arr[] = new int[3];
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
    Arrays.sort(arr);
    System.out.println(arr[1]);
    }
    }
}
