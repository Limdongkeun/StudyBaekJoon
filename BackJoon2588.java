package SoloTest.BaekJoon;

import java.util.Scanner;

public class BackJoon2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //수학적 방법
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        System.out.println(num1 * (num2%10));
//        System.out.println(num1 * (num2%100/10));
//        System.out.println(num1 * (num2/100));
//        System.out.println(num1 * num2);

        //첫번째는 숫자로 받고 두번쨰는 문자열로 받은 후 하나씩 자르고 그걸 숫자로 변환
        int num3 =scanner.nextInt();
        String str = scanner.next();

        System.out.println(num3 * (str.charAt(2)-'0'));
        System.out.println(num3 * (str.charAt(1)-'0'));
        System.out.println(num3 * (str.charAt(0)-'0'));
        System.out.println(num3 * Integer.parseInt(str));
    }
}
