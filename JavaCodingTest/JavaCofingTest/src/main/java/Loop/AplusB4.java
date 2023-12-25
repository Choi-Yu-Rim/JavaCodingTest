package Loop;

import java.io.*;
import java.util.Scanner;

public class AplusB4 {
    public static void main(String[] args) throws IOException {
        /*
        *   입력은 여러 개의 테스트 케이스로 이루어져 있다.
            각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        * */

        Scanner sc = new Scanner(System.in);
        String res = "";

        while(sc.hasNext()){
            int b = sc.nextInt();
            int c = sc.nextInt();
            res = (b+c)+"";
            System.out.println(res);
        }

        // BufferedReader 사용 시 IOException 필수
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        while(true){
//            String a = br.readLine();
//            if( a == null ) break;
//
//            int c = Integer.parseInt(a.split(" ")[0]);
//            int d = Integer.parseInt(a.split(" ")[1]);
//            System.out.println(c+d);
//        }
    }
}
