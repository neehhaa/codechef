package starter115;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while (testcase-- > 0) {
            int chocolates = input.nextInt();
            if (chocolates % 2 == 0) {
                System.out.println(chocolates/2 + " " + chocolates);
            } else {
                int oddChoco = (chocolates / 2) + 1;
                System.out.println(oddChoco + " " + chocolates);
            }
        }
    }
}