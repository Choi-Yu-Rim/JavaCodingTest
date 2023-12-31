package String;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class dial {
    /* 5622.
    *
    * 전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
    * 숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
    * 상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
    * 할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하시오.
    *
    *  */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String tel = br.readLine();

        // 대문자는 101 ~ 132
        // 65 ~ 67 ABC = 3
        // 68 ~ 70 DEF = 4
        // 71 ~ 73 GHI = 5
        // 74 ~ 76 JKL = 6
        // 77 ~ 79 MNO = 7
        // 80 ~ 83 PQRS = 8
        // 84 ~ 86 TUV = 9
        // 87 ~  90 WXYZ = 10
        // 91 ~   = 11 (나머지)
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=65; i <91; i ++){
            if(i < 65){
                map.put(i,0);
            }else if(i < 68){
                map.put(i,3);
            } else if (i < 71) {
                map.put(i,4);
            } else if (i < 74) {
                map.put(i,5);
            } else if (i < 77) {
                map.put(i,6);
            } else if (i < 80) {
                map.put(i,7);
            } else if (i < 84) {
                map.put(i,8);
            } else if (i < 87) {
                map.put(i,9);
            } else if (i < 91) {
                map.put(i,10);
            } else {
                map.put(i,11);
            }
        }

        int sum = 0;
        for(int j=0; j < tel.length(); j++){
            int a = tel.charAt(j);
            sum += map.get(a);
        }

        bw.write(sum + "");
        bw.flush();
        bw.close();
    }
}
