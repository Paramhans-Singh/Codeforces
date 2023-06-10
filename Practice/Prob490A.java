import java.util.ArrayList;
import java.util.Scanner;

public class Prob490A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    int arr[] = new int[t];
    int count1 = 0;
    ArrayList<Integer> arr1 = new ArrayList<>();
    int count2 = 0;
    ArrayList<Integer> arr2 = new ArrayList<>();
    int count3 = 0;
    ArrayList<Integer> arr3 = new ArrayList<>();


    for(int i=0;i<arr.length;i++){
        arr[i] = s.nextInt();
        if(arr[i]==1){count1++; arr1.add(i);}
        else if(arr[i]==2){count2++; arr2.add(i);}
        else {count3++; arr3.add(i);}
    }
    int ans = Math.min(count1,(Math.min(count2, count3)));
    System.out.println(ans);
    for(int i=0;i<ans;i++){
        System.out.println((arr1.get(i)+1)+" "+(arr2.get(i)+1)+" "+(arr3.get(i)+1));
    }
    }
}
