package starter110;

import java.util.Scanner;

public class WaterPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int weight = input.nextInt();
        int height = input.nextInt();

        if ( 60 <= weight && 130 >= height){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
