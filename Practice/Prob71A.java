import java.util.Scanner;

public class Prob71A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    while(n-->0){
        String str = s.next();
        int length = str.length();
        if(length>10){
         System.out.print(str.charAt(0));
         System.out.print((length-2));
         System.out.print(str.charAt(length-1));
         System.out.println();
        }
        else{
            System.out.println(str);
        }
    }
    }
}
