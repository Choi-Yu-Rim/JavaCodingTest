package String;

import java.io.*;

public class wordLength {

    public static void main(String[] args) throws IOException {

        /*2743.
        *
        * 알파벳으로만 이루어진 단어를 입력받아, 그 길이를 출력하는 프로그램을 작성하시오.
        * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어가 주어진다. 단어의 길이는 최대 100이다.
        * 첫째 줄에 입력으로 주어진 단어의 길이를 출력한다.
         * */

        //문자열 읽을 버퍼 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();

        bw.write(word.length() + ""); // 문자열 출력을 위해 String으로 변환
        bw.flush();
        bw.close();
    }
}
