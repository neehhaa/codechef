package starter137;

import java.util.Scanner;

public class ElectionHopes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int chef = input.nextInt();
        int chefu = input.nextInt();

        if (chef >= (chefu * 2)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
