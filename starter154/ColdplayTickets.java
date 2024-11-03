package starter154;

import java.util.Scanner;

public class ColdplayTickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int friends = input.nextInt();
        System.out.println((friends + 1) * 5000);
    }
}
