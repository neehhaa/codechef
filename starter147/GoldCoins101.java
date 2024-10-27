package starter147;

import java.util.Scanner;

public class GoldCoins101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int winner = input.nextInt();
        int loser = input.nextInt();
        int chef = input.nextInt();
        int chefina = input.nextInt();

        if (chef > chefina){
            System.out.println(winner);
        } else {
            System.out.println(loser);
        }
    }
}
