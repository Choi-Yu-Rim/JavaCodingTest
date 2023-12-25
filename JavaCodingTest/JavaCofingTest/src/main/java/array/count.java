package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class count {
    public static void main(String[] args) {
        /*
        * 10807.
        * 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.
        * 첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다.
        * 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.
        * */

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt(); //배열에 담을 개수
        Integer[] arr = new Integer[cnt];

        int res = 0; // 찾고자 하는 숫자 count

        for (int i=0; i<cnt ; i++){
            int num = sc.nextInt(); //배열에 담을 개수
            arr[i] = num;
        }

        int find = sc.nextInt(); //찾을 숫자

        /*방법 1. for 문 돌리기 */
//        for (int i=0; i<arr.length ; i++){
//            if(arr[i] == find) res++;
//        }

        /*방법 2. 배열을 List<Integer> 형 리스트로 변환*/
//        List<Integer> list = Arrays.stream(arr)
//                .boxed()// arr의 요소 박싱 ; 필요한 이유..?
//                .collect(Collectors.toList()); // 리스트로 변환
        List<Integer> list = Arrays.asList(arr);

        res = Collections.frequency(list, find);

        System.out.println(res);

    }
}
