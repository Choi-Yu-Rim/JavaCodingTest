package String;

import java.io.*;

public class CharAndString {

    public static void main(String[] args) throws IOException {

        /*27866.
        *
        * 첫째 줄에 영어 소문자와 대문자로만 이루어진 단어
            $S$가 주어진다. 단어의 길이는 최대
            $1\,000$이다.
            둘째 줄에 정수
            $i$가 주어진다. (
            *
            * $S$의 $i$번째 글자를 출력한다.
        * */

        //문자열 읽을 버퍼 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();
        int at = Integer.valueOf(br.readLine()) -1; // 글자 index 로 보기 때문에

        bw.write(word.charAt(at));
        bw.flush();
        bw.close();
    }
}
