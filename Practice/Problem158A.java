import java.util.Scanner;

public class Problem158A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
    }
    int limit = arr[k-1];
    int count=0;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=limit && arr[i]>0){
            count++;
        }
    }
    System.out.println(count);
    }
}
