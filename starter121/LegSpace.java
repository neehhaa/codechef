package starter121;

import java.util.Scanner;

public class LegSpace {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int students = input.nextInt();
        int seats = input.nextInt();
        if (seats > students){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
