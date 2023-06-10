import java.util.Scanner;

public class Prob427A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    int arr[] = new int[t];
    int unrated =0;
    int count=0;
    for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
        if(arr[i]!=-1)count+=arr[i];
        else {
            if(count>0){
               count--;
            }
            else{
              unrated++;
            }
        }
        
        
    }
    if(unrated>0) System.out.println(unrated);
    else System.out.println("0");
}
}
