import java.util.Arrays;
import java.util.Scanner;

public class Prob381A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int arr[] = new int[t];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr);
        int seerja = 0;
        int deema = 0;
        // int j = arr.length - 2;
        for (int i = arr.length - 1,j=arr.length - 2;i>=0 && j>=0; i-=2, j-=2) {
            seerja += arr[i];
            deema += arr[j];
        }
        if(arr.length%2==0){
           System.out.println(seerja + " " + deema);
        }
        else{
            seerja+=arr[0];
            System.out.println(seerja+" "+deema);
        }
        
    }
}
