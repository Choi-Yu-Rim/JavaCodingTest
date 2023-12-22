package InputOutputWithCal;

import java.util.Scanner;

public class child {
    public static void main(String[] args)  {
        /*
        11382.
        꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
        * */
        Scanner ab = new Scanner(System.in);

        Long a = ab.nextLong();
        Long b = ab.nextLong();
        Long c = ab.nextLong();

        System.out.println(a + b + c);
    }
}
