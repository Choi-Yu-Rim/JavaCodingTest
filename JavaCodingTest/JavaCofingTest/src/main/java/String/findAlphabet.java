package String;

import java.io.*;

public class findAlphabet {

    public static void main(String[] args) throws IOException {
        /*
        * 10809.
        * 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
         * */

        //문자열 읽을 버퍼 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();

        // 아스키 97 ~122 가 영문 소문자
        for(int j=97; j < 123; j++){
            // 숫자 -> 문자로 변환해서 indexof 걸기
            char a = (char) j;
            bw.write(word.indexOf(a) + " ");
        }
        bw.flush();
        bw.close();

    }
}
