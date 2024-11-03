package starter128;

import java.util.Scanner;

public class Reach5Star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int currentRating = input.nextInt();
        int ratingGained = input.nextInt();
        int rating = currentRating + ratingGained;
        if (rating >= 2000){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
