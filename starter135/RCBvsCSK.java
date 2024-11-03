package starter135;

import java.util.Scanner;

public class RCBvsCSK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rcb = input.nextInt();
        int csk = input.nextInt();
        if (rcb > csk && rcb-csk >= 18){
            System.out.println("RCB");
        } else {
            System.out.println("CSK");
        }
    }
}
