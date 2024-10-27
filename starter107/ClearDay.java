package starter107;

import java.util.Scanner;

public class ClearDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rainy  = input.nextInt();
        int cloudy  = input.nextInt();

        System.out.println(7 - (rainy + cloudy));

    }
}
