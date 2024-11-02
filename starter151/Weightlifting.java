package starter151;

import java.util.Scanner;

public class Weightlifting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int round1A = input.nextInt();
        int round2A = input.nextInt();

        int round1B = input.nextInt();
        int round2B = input.nextInt();

        int round1C = input.nextInt();
        int round2C = input.nextInt();

        int A = Math.max(round1A, round2A);
        int B = Math.max(round1B, round2B);
        int C = Math.max(round1C, round2C);

        System.out.println(A+B+C);

    }
}
