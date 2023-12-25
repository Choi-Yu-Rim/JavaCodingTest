package array;

import java.util.Arrays;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        /*
        * 10818.
        * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
            첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
            둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
            첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
        * */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()]; // 배열의 크기

        // 배열에 담기
        for (int i=0; i< arr.length ; i++){
            int num = sc.nextInt(); //배열에 담을 개수
            arr[i] = num;
        }

        Arrays.sort(arr);

        System.out.println(arr[0]); //최소
        System.out.println(arr[arr.length-1]); //최대

    }
}
