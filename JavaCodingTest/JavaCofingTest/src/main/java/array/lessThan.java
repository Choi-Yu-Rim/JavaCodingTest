package array;

import java.util.Scanner;

public class lessThan {
    public static void main(String[] args) {
        /*
        * 10871.
        * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
            첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
            둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
            X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
        * */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()]; // 배열의 크기
        int a = sc.nextInt(); // 비교숫자

        // 배열에 담기
        for (int i=0; i< arr.length ; i++){
            int num = sc.nextInt(); //배열에 담을 개수
            arr[i] = num;
        }

        /*방법 1. for 문 돌리기 */
        for (int i=0; i < arr.length ; i++){
//            if(arr[i] < a) System.out.print( ((i != 0) ? " " : "") + arr[i]);
            if(arr[i] < a) System.out.print(arr[i] + " "); // ????????????????
        }

    }
}
