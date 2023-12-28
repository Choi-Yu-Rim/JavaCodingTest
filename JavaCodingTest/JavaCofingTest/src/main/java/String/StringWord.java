package String;

import java.io.*;
import java.util.StringTokenizer;

public class StringWord {

    public static void main(String[] args) throws IOException {

        /*9086.
        * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다.
        * 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
        * 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
         * */

        //문자열 읽을 버퍼 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk = new StringTokenizer(br.readLine(),"\n");
        int cnt = Integer.valueOf(tk.nextToken()); // 반복 횟수

        for(int i=0; i < cnt; i++){
            StringTokenizer tk2 = new StringTokenizer(br.readLine(),"\n");
            String word = tk2.nextToken();
            bw.write(String.valueOf(word.charAt(0)) + word.charAt(word.length()-1) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
