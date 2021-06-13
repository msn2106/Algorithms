package bitManipulation;

import java.util.Scanner;

public class DetectOppositeSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(oppositeSign(a,b)) System.out.println(true);
        else System.out.println(false);
    }

    public static boolean oppositeSign(int a, int b){
        return (a^b) < 0;
    }
}
