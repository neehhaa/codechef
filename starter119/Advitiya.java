package starter119;

import java.util.Scanner;

public class Advitiya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();
        if(date >= 16){
            System.out.println("ADVITIYA");
        }else {
            System.out.println("WAITING FOR ADVITIYA");
        }
    }
}
