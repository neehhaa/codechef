package starter117;

import java.util.Scanner;

public class YearlyPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("K" + String.format("%02d", year%100));
    }
}
