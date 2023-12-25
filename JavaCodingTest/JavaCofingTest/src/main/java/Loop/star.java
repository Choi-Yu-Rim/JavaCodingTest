package Loop;

import java.io.*;

public class star {

    /*write 하는 방법 1 */
    public static void main(String[] args) throws IOException {
        /* 2438.
         * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
         * */

        // BufferedReader 사용 시 IOException 필수
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(bf.readLine()); //입력 값 받기
        // BufferedWriter 사용 시 flush와 close 필수
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i=0; i < cnt ; i++){
            for(int j=0; j < i+1; j++){
                bw.write("*"); // 버퍼에 문자열 쓰기(등록)
            }
            bw.write("\n");
        }

        bw.flush(); // 버퍼에 있는 데이터 모두 출력
        bw.close(); // 버퍼 닫기
    }
}
