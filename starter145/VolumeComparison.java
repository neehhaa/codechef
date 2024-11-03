package starter145;

import java.util.Scanner;

public class VolumeComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int height = input.nextInt();
        int width = input.nextInt();
        int edge = input.nextInt();
        int volumeCuboid = length * width* height;
        int volumeCube = edge * edge * edge;
        if (volumeCuboid > volumeCube){
            System.out.println("Cuboid");
        } else if (volumeCuboid < volumeCube){
            System.out.println("Cube");
        } else {
            System.out.println("Equal");
        }
    }
}
