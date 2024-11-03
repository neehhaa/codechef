package starter125;

import java.util.Scanner;

public class Rule5050 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int attendance = input.nextInt();
            int marks = input.nextInt();
            if (attendance < 50){
                System.out.println("Z");
            } else if (marks < 50) {
                System.out.println("F");
            } else {
                System.out.println("A");
            }
        }
    }
}
