package Loop;

import java.util.Scanner;

public class AplusB5 {
    public static void main(String[] args) {
        /*
        *  10952.
        *  입력은 여러 개의 테스트 케이스로 이루어져 있다.
            각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
            입력의 마지막에는 0 두 개가 들어온다.
        * */

        Scanner sc = new Scanner(System.in);
        String res = "";
        Boolean next = true;

        while(sc.hasNext()){
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(b==0 && c==0) break;
            res = (b+c)+"";
            System.out.println(res);
        }

    }
}
