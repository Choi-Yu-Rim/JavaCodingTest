package Loop;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        /* 8393.
        * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
         * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;

        //3
        for(int i=0; i < a ; i++){
            sum += i+1;
        }
        System.out.println(sum);
    }
}
