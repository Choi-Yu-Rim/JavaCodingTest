package InputOutputWithCal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) throws IOException {
        /*
        * 사용자의 값을 입력받는 4가지 방법
        *
        * 1. InputStream        : 바이트 단위로 문자를 읽어 들인다.
        * 2. InputStreamReader  : 문자 단위로 읽어 들인다.
        * 3. BufferedReader     : 문자열을 읽어 들인다. -> 엔터만 구분으로 해서 버퍼리더는 입력시 엔터로 구분 해야 함
        * 4. Scanner            : 위 3가지 보다 가장 쉽게 입력받을 수 있음 (공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다.)
        * */

//        Scanner ab = new Scanner(System.in);
//
//        int a = ab.nextInt();
//        int b = ab.nextInt();
//
//        System.out.println(a+b);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        System.out.println(a+b);

    }
}
