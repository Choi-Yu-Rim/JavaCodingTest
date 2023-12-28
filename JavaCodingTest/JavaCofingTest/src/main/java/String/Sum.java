package String;

import java.io.*;
import java.util.StringTokenizer;

public class Sum {

    public static void main(String[] args) throws IOException {
        /*
        * 11720.
        * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
         * */

        //문자열 읽을 버퍼 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk = new StringTokenizer(br.readLine(),"\n");
        int sum = 0;

        String[] num = br.readLine().split("");

        for(int i=0; i < num.length; i++){
            sum += Integer.parseInt(num[i]);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();

    }
}
