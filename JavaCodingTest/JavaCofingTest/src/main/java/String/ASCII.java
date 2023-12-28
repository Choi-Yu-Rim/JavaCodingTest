package String;

import java.io.*;

public class ASCII {

    public static void main(String[] args) throws IOException {

        /*11654.
        * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
         * */

        //문자열 읽을 버퍼 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int word = br.readLine().charAt(0); // 문자열의 charAt(0)을 int 로 받은 후

        bw.write(String.valueOf(word)); // String 으로 출력

        bw.flush();
        bw.close();
    }
}
