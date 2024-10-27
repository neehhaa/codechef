package starter133;

import java.util.Scanner;

public class DevouringDonuts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int donuts = input.nextInt();
        int calories = input.nextInt();

        System.out.println(donuts * calories);
    }
}
