import java.util.Scanner;

public class Prob734A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();

        int countA = 0;
        int countD = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A')
                countA++;
            else
                countD++;
        }

        if (countA > countD) {
            System.out.println("Anton");
        }

        else if (countA == countD)
            System.out.println("Friendship");

        else {
            System.out.println("Danik");
        }
    }
}
