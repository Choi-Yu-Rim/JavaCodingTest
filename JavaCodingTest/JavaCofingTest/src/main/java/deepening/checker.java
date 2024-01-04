package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class checker {

    static int max = 0;

    // 1316.
    // 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
    // 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
    //단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int repeat = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=0; i < 1; i++){
            String word = br.readLine(); // 단어 한 줄 가져오기
            String[] arr = word.split("");
            List<String> strList = new ArrayList<>(Arrays.asList(word.split(""))); // 한글자씩 배열에 담기
            int[] arrCnt = new int[word.length()];

            for(int j=0; j < word.length(); j++){
                String compare = String.valueOf(word.charAt(i));
                int count = 0;

                for(int k=j+1; k < word.length(); k ++){ // 나 이후로 같은게 있는지 확인
                    if(compare.equals(arr[k])){
                        count++;
                    }
                }

                // 나 말고 아무것도 없으면 cnt++
                if(count > 0){

                }
            }

        }

        System.out.print(cnt);
    }
}
