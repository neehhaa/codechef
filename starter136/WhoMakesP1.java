package starter136;

import java.util.Scanner;

public class WhoMakesP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tyro = input.nextInt();
        int dom = input.nextInt();
        if (tyro <= dom){
            System.out.println("Tyro");
        }else {
            System.out.println("Dom");
        }
    }

}
