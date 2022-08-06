package SoloTest.BaekJoon;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BackJoon2750 {

    public static int removeDuplicateElements(int arr[], int n){
        if (n == 0 || n == 1){
            return n;
        }

        int[] temp = new int[n];
        int j = 0;

        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }

        temp[j++] = arr[n-1];

        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        for (int i=1;i< arr.length;i++){
            int ans = i;
            while (ans>0 && arr[ans-1]>arr[ans]){
                int tem = arr[ans-1];
                arr[ans - 1] = arr[ans];
                arr[ans] = tem;
                ans--;
            }
        }
        return j;
    }

    public static void main (String[] args) {
        int[] intArr = new int[] {1, 1, 2, 3, 5, 6, 8, 7};
        int n = intArr.length-1;

        n = removeDuplicateElements(intArr, n);

        for (int i=0; i<=n; i++)
            System.out.print(intArr[i] + " ");
    }

    //    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        int[] num = new int[N];
//
//        for(int i=0;i< num.length;i++){
//            num[i] = sc.nextInt();
//        }
//        Arrays.sort(num);
//        for(int i=0;i< num.length;i++){
//            System.out.print(num[i]);
//        }

}
