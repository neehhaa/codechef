package starter158;

import java.util.Scanner;

public class DiwaliDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int giftPrice = input.nextInt();
        int voucher = input.nextInt();
        if (voucher >= giftPrice){
            System.out.println(0);
        }
        else {
            System.out.println(giftPrice - voucher);
        }

    }
}
