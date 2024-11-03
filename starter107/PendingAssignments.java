package starter107;

import java.util.Scanner;

public class PendingAssignments {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testcase = input.nextInt();

        while(testcase-- > 0){
            int assignments = input.nextInt();
            int time = input.nextInt();
            int days = input.nextInt();

            float totalTimeInHours = (float)(assignments * time)/60;
            float totalTimeInDays = (float)totalTimeInHours/24;

            if (totalTimeInDays <= days){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }
    }
}
