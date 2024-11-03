package starter144;

import java.util.Scanner;

public class CapitalGainTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentTax = input.nextInt();
        int newTax = input.nextInt();
        if (currentTax < newTax){
            System.out.println("INCREASED");
        } else if (currentTax > newTax){
            System.out.println("DECREASED");
        }else {
            System.out.println("SAME");
        }
    }
}
