import java.util.Arrays;
import java.util.Scanner;

public class Prob228A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    // int t = s.nextInt();
    int count=0;
    int arr[] = new int[4];
    for(int i=0;i<arr.length;i++){
    arr[i]=s.nextInt();
    }

    Arrays.sort(arr);
    for(int i=1;i<arr.length;i++){
        if(arr[i]==arr[i-1]){
            count++;
        }
    }
    System.out.println(count);
    }
}
