package starter105;

import java.util.Scanner;

public class BoneAppetit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bones = input.nextInt();
        int blood = input.nextInt();
        int bonesTreat = input.nextInt();
        int bloodTreat = input.nextInt();
        System.out.println((bones * bonesTreat) + (blood * bloodTreat));

    }
}
