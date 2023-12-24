package Loop;

import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        /* 10950.
        * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
        * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String res = "";

        for(int i =0; i < a ; i++){
            int b = sc.nextInt();
            int c = sc.nextInt();
            res += (b+c) + "\n";
        }

        System.out.println(res);
    }
}
