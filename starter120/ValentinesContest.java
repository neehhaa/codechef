package starter120;

import java.util.Scanner;

public class ValentinesContest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date = input.nextInt();
        if (date == 121){
            System.out.println("Likely");
        }else {
            System.out.println("Unlikely");
        }
    }
}
