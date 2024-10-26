package starter157;

import java.util.Scanner;

public class GlassPrices {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int plasticPrice = input.nextInt();
        int metalPrice = input.nextInt();

        if ((2 * plasticPrice) >= metalPrice){
            System.out.println("METAL");
        }else {
            System.out.println("PLASTIC");
        }
    }
}
