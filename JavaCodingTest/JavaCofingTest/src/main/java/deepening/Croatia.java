package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Croatia {

    static int max = 0;

    // 2941.
    //    예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
    //dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        List<String> strList = new ArrayList<>(Arrays.asList(arr));
        int cnt = 0;

        for(int i=0; i <word.length(); i++){
            String A = String.valueOf(word.charAt(i));
            String compare = "";

            if(strList.contains(A)) {
                cnt ++;
            }else {
                int oriCnt = cnt;
                for(int j=i; j < i+3  && (j < word.length()); j++){ // 최대 3글자까지
                    compare += word.charAt(j);
                    if(strList.contains(compare)) {
                        cnt ++;
                        i = j;
                        break;
                    }
                }

                if(cnt == oriCnt){ // cnt 에 변화가 없으면 한글자만 그냥 cnt 세어줌
                    cnt++;
                }
            }

        }

        System.out.print(cnt);
    }
}
