package starter134;

import java.util.Scanner;

public class MorningRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int width = input.nextInt();
        int surface = 2*(length + width);
        if (surface >= 1000){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
