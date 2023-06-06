import java.util.Scanner;

public class ProblemB {

    public static int count(int [] arr,int ind, int s, int sum, int n ){
        if(s>sum){
            return 0;
        }
        if(ind==n){
            if(s<=sum)return 1;
            else return 0;
        }
        s+=arr[ind];
        int l = count(arr, ind+1, s, sum, n);
        s-=arr[ind];
        int r = count(arr, ind+1, s, sum, n);
        return l+r;
    }
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-->0){
    int n = s.nextInt();
    int k = s.nextInt();

    int arr[] = new int[k];
    arr[0]=1;
    for(int i=0;i+1<k;i++){
        arr[i+1]=arr[i]*2;
    }

    int ans = count(arr,0 , 0, n, k);
    System.out.println(ans);
    }
    }
}
