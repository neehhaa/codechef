package starter130;

import java.util.Scanner;

public class GiantWheel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height = input.nextInt();
        if (height >= 60){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
