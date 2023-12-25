package Loop;

import java.io.*;

public class fastAplusB7 {

    /*write 하는 방법 1 */
    public static void main(String[] args) throws IOException {
        /* 11021.
         * 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
         * 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
         * */

        // BufferedReader 사용 시 IOException 필수
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.valueOf(bf.readLine()); //입력 값 받기
        // BufferedWriter 사용 시 flush와 close 필수
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String res = "";

        for(int i =0; i < cnt ; i++){
            String a = bf.readLine(); //입력 값 받기
            String aa[] = a.split(" ");
            int b = Integer.valueOf(a.split(" ")[0]);
            int c = Integer.valueOf(a.split(" ")[1]);
            bw.write("Case #"+ (i+1) +": " + (b+c) + "\n"); // 버퍼에 문자열 쓰기(등록)
        }

        bw.flush(); // 버퍼에 있는 데이터 모두 출력
        bw.close(); // 버퍼 닫기
    }

}
