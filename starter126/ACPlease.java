package starter126;

import java.util.Scanner;

public class ACPlease {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int temperature = input.nextInt();
        if (temperature >30){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
