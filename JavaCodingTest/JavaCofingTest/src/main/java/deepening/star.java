package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class star {

    // 2444.
    // 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
    // 체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
    // 체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
    // 동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.valueOf(br.readLine());
//        int maxCnt = cnt * 2 - 1;
//        String[][] array = new String[maxCnt][maxCnt];
//
//        int left = cnt-1; // 별 시작 점 +
//        int right = cnt-1; // 별 시작 점 -
//        for(int i=0; i < maxCnt; i ++){
//
//            for(int l= left; l < right+1; l++){
//                array[i][l] = "*";
//            }
//
//            if(i < cnt-1){ // 기준 줄 까지는 정방향
//                left--;
//                right++;
//            }else { // 그외는 역방향
//                left++;
//                right--;
//            }
//        }
//
//        //담고 배열 출력
//        for(int i=0; i < maxCnt; i ++){
//            for(int k=0; k <maxCnt; k ++){
//                if (array[i][k] == null ){
//                    System.out.print(" ");
//                }else {
//                    System.out.print(array[i][k]);
//                }
//            }
//            System.out.print("\n");
//        }


        // 방법 1안돼서 2로 변경
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();

        for(int i = 1; i <= N ; i++) {
            for(int j = 0; j < N-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }

        for(int i = N-1; i >= 0 ; i--) {
            for(int j = 0; j < N-i; j++)
                System.out.print(" ");
            for(int j = 0; j < i*2-1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
