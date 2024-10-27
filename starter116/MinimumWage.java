package starter116;

import java.util.Scanner;

public class MinimumWage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int income = input.nextInt();

        if (income > 11){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
