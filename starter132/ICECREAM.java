package starter132;

import java.util.Scanner;

public class ICECREAM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int price = input.nextInt();
        int amount = input.nextInt();
        if (price*2 <= amount){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

}
