package SoloTest.BaekJoon;

import java.util.Scanner;

public class BaekJoon2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int currentTime = sc.nextInt();
        int currentMin = sc.nextInt();
        int runMin = sc.nextInt();

        currentTime += runMin/60;
        currentMin += runMin%60;

        if(currentMin >59){
            currentTime +=1;
            currentMin -=60;
        }

        if (currentTime >23){
            currentTime -=24;
        }

        System.out.println(currentTime + " " + currentMin);


    }
}
