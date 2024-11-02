package starter142;

import java.util.Scanner;

public class WritingSpeed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pageTime = input.nextInt();
        int totalTime = pageTime * 5;
        if (totalTime <= 60){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
