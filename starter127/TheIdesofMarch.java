package starter127;

import java.util.Scanner;

public class TheIdesofMarch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();

        if(date == 15){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
