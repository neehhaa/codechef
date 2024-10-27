package starter155;

import java.util.Scanner;

public class ChefAndParole {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int days = input.nextInt();
        if (days >= 7){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
