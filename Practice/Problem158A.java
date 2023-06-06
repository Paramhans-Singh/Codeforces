import java.util.Scanner;

public class Problem158A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    int arr[] = new int[n];
    for(int num : arr){
        arr[num]=s.nextInt();
    }
    int limit = arr[k-1];
    int count=0;
    for(int num :arr){
        if(arr[num]>=limit){
            count++;
        }
    }
    System.out.println(count);
    }
}
