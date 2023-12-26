package array;

import java.util.Arrays;
import java.util.Scanner;

public class remained {
    public static void main(String[] args) {
        /*
        * 3052.
        * 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
            수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
        * */

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        // 10개 입력받기
        for (int i=0; i<arr.length ; i++){
            int num = sc.nextInt(); //배열에 담을 개수
            arr[i] = num%42;
        }

        // 배열의 distinct를 이용해서 중복 제거
        // 이때 배열의 length가 변경 됨
        arr = Arrays.stream(arr)
                .distinct()// arr의 요소 박싱 ; 필요한 이유..?
                .toArray(); // 리스트로 변환

        System.out.println(arr.length);

    }
}
