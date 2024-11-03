package starter114;

import java.util.Scanner;

public class PaintingWalls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int testcase = input.nextInt();

        while(testcase-- > 0){
            int height = input.nextInt();
            int width = input.nextInt();
            int amount = input.nextInt();
            int area = 2 * height * width;
            System.out.println(amount/area);
        }
    }
}
