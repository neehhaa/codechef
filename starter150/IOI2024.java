package starter150;

import java.util.Scanner;

public class IOI2024 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();
        if (date <= 8){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
