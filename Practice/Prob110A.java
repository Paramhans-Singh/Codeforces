import java.util.Scanner;

public class Prob110A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();

        int countLucky=0;
       

        while (n!=0) {
           if(n%10==7 || n%10==4)countLucky++;
            n/=10;
        }
        if(countLucky == 7 || countLucky == 4)
        System.out.println("YES");
        else
        System.out.println("NO");

    }
}
