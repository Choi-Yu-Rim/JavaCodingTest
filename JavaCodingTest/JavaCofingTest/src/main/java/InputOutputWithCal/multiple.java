package InputOutputWithCal;

import java.util.Scanner;

public class multiple {
    public static void main(String[] args)  {
        /* 2588.
        (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
        (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
        */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        int f = Integer.valueOf(b);

        int c = Character.getNumericValue(b.charAt(0));
        int d = Character.getNumericValue(b.charAt(1));
        int e = Character.getNumericValue(b.charAt(2));

        System.out.println(a*e);
        System.out.println(a*d);
        System.out.println(a*c);
        System.out.println(a*f);

    }
}
