import java.util.Scanner;

public class reverseprime_check
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = in.nextInt();
        int c = 0;
        int copyn = n;
        int revNum = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            System.out.println(n + " is a prime number");
        }
        else {
            System.out.println(n + " is not a prime number");
        }
        while(copyn != 0) {
            int digit = copyn % 10;
            copyn /= 10;
            revNum = revNum * 10 + digit;
        }
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 3) {
            System.out.println(n + " is a reversed prime number");
        }
        else {
            System.out.println(n + " is not a reversed prime number");
        }
    }
}