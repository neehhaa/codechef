package starter129;

import java.util.Scanner;

public class FootballTraining {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int leo = input.nextInt();
        int ronald = input.nextInt();
        if (leo > ronald){
            System.out.println("FREEKICK");
        }else {
            System.out.println("PENALTY");
        }
    }
}
