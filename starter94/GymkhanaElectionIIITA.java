package starter94;

import java.util.Scanner;

public class GymkhanaElectionIIITA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int nominated = input.nextInt();
            int totalVoters = input.nextInt();
            System.out.println((totalVoters/2)+1);

        }
    }
}
