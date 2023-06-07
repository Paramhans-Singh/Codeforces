import java.util.Scanner;

public class Prob61A {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    
    String str1 = s.next();
    String str2 = s.next();
    String ans ="";

    for(int i=0;i<str1.length();i++){
     if(str1.charAt(i)!=str2.charAt(i)){
        ans+='1';
     }
     else ans+='0';
    }
    System.out.println(ans);
    }
}
