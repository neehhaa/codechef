package starter125;

import java.util.Scanner;

public class Overspeeding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speed = input.nextInt();
        if(speed <= 40){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
