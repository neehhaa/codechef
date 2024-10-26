import java.util.Scanner;

public class AIisComing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int difficulty = input.nextInt();
        if (difficulty <= 60 ){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
