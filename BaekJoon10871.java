package SoloTest.BaekJoon;

import java.util.Scanner;

public class BaekJoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrNum = sc.nextInt();
        int num = sc.nextInt();
        int[] intArr = new int[arrNum];

        for (int i =0; i< arrNum;i++){
                intArr[i] = sc.nextInt();
        }

        for(int i=0;i< intArr.length;i++){
            if (intArr[i] < num){
                System.out.println(intArr[i]);
            }
        }
    }
}
