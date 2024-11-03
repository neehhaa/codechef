package starter119;

import java.util.Scanner;

public class Judged {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while(testcase-- > 0){
            int judge1 = input.nextInt();
            int judge2 = input.nextInt();
            int judge3 = input.nextInt();
            int judge4 = input.nextInt();
            int judge5 = input.nextInt();
            int score = judge1 + judge2 + judge3 + judge4 + judge5;
            if (score >= 4){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
