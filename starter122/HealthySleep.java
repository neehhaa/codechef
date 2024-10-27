package starter122;

import java.util.Scanner;

public class HealthySleep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hours = input.nextInt();
        if (hours > 8){
            System.out.println("MORE");
        } else if (hours == 8) {
            System.out.println("PERFECT");
        } else {
            System.out.println("LESS");
        }
    }
}
