package starter124;

import java.util.Scanner;

public class SummerTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperature = input.nextInt();

        if (temperature > 35) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
