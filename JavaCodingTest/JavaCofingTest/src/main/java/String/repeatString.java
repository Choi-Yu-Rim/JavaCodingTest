package String;

import java.io.*;
import java.util.StringTokenizer;

public class repeatString {
    /*2675.
    *
    *문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
    * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
    * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
    * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i < cnt; i ++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int repeat = Integer.valueOf(st.nextToken());
            String word = st.nextToken();
            String[] a = word.split("");

            for(int k=0; k < a.length; k++){
                for(int j=0; j < repeat; j++){
                    bw.write(a[k]);
                }
            }
            bw.write("\n");
            bw.flush();
        }
        bw.close();
    }
}
