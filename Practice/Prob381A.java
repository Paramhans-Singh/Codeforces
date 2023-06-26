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

        int seerja = 0;
        int deema = 0;
        int i = 0;
        int j = arr.length - 1;

        while (i<=j) {
            if (arr[i] > arr[j]) {
                seerja += arr[i];
                i++;
            } else {
                seerja += arr[j];
                j--;
            }
            if (j>=0 && i<arr.length) {
                if (arr[i] > arr[j]) {
                    deema += arr[i];
                    i++;
                } else {
                    deema += arr[j];
                    j--;
                }
            }

        }

        System.out.println(seerja + " " + deema);
    }
}
