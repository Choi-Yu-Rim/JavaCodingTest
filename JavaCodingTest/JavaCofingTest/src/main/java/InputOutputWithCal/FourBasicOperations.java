package InputOutputWithCal;

import java.util.Scanner;

public class FourBasicOperations {
    public static void main(String[] args)  {
        /* 10869. 두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오. */
        Scanner ab = new Scanner(System.in);

        int a = ab.nextInt();
        int b = ab.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }
}
