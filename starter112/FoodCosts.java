package starter112;

import java.util.Scanner;

public class FoodCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weekdayCost = input.nextInt();
        int weekendCost = input.nextInt();

        int totalCost = (weekdayCost * 6) + weekendCost;
        System.out.println(totalCost);
    }
}
