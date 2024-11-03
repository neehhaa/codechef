package starter149;

import java.util.Scanner;

public class ApproximateAnswer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int answer = input.nextInt();
        int correctAnswer = input.nextInt();
        int considerationInt = input.nextInt();
        int consider = Math.abs(correctAnswer - answer);
        if (consider <= considerationInt){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
