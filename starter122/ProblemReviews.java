package starter122;

import java.util.Scanner;

public class ProblemReviews {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = 1;

        while(testcase-- > 0){
            boolean allAboveFour = true;
            int judges = input.nextInt();
            int[] scores = new int[judges];
            for (int i = 0; i < judges; i++) {
                scores[i] = input.nextInt();
            }
            for (int i = 0; i < judges; i++) {
                if (scores[i] <= 4){
                    System.out.println("No");
                    allAboveFour = false;
                }
            }
            if (allAboveFour) {
                System.out.println("Yes");
            }
        }
    }
}
