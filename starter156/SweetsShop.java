package starter156;

import java.util.Scanner;

public class SweetsShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int amount = input.nextInt();
        int laddus = input.nextInt();
        int amountRemaining = amount - (laddus * 10);
        int jalebi = amountRemaining / 20;
        System.out.println(jalebi);
    }
}
