package starter114;

import java.util.Scanner;

public class ChristmasGreetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();
        if (date == 25){
            System.out.println("CHRISTMAS");
        }else {
            System.out.println("ORDINARY");
        }
    }
}
