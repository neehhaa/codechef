package starter143;

import java.util.Scanner;

public class InternationalJusticeDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int prosecution = input.nextInt();
        int defense = input.nextInt();

        if (prosecution >= defense){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
