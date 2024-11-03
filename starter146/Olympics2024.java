package starter146;

import java.util.Scanner;

public class Olympics2024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gold = input.nextInt();
        int goldRequired = 5 - gold;
        int silver = input.nextInt();
        int silverRequired = 5 - silver;
        int bronze = input.nextInt();
        int bronzeRequired = 5 - bronze;
        System.out.println(goldRequired + silverRequired + bronzeRequired);
    }
}
