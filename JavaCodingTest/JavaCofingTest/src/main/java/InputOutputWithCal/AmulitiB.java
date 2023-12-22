package InputOutputWithCal;

import java.util.Scanner;

public class AmulitiB {
    public static void main(String[] args)  {
        /*
        * 사용자의 값을 입력받는 4가지 방법
        *
        * 1. InputStream        : 바이트 단위로 문자를 읽어 들인다.
        * 2. InputStreamReader  : 문자 단위로 읽어 들인다.
        * 3. BufferedReader     : 문자열을 읽어 들인다.
        * 4. Scanner            : 위 3가지 보다 가장 쉽게 입력받을 수 있음 (공백(띄어쓰기) 또는 개행(줄 바꿈)을 기준으로 읽는다.)
        * */
        Scanner ab = new Scanner(System.in);

        int a = ab.nextInt();
        int b = ab.nextInt();

        System.out.println(a*b);
    }
}
