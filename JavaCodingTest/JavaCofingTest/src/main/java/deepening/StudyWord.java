package deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class StudyWord {

    static int max = 0;

    // 1157.
    //    알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
    //    첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();

        Map <Character, Integer> map = new HashMap<Character, Integer>();

        // 방법 1. 50 % 부근에서 틀렸음 why??
//        for(int i=0; i < word.length(); i++){
//
//            char letter = word.charAt(i);
//            int cnt = 0;
//
//            if(i != 0){
//                if(map.containsKey(letter)){ //map 이 해당 키를 가지고 있으면
//                    cnt = map.get(letter) + 1; // 원래 cnt++
//                }else { // map에 해당 키가 없으면 cnt = 0 + 1
//                    cnt = 1;
//                }
//            }else {
//                cnt = 1;
//            }
//
//            map.put(letter,cnt); // 처음게 아니면?
//        }
//        Integer max = map.entrySet()
//                .stream()
//                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
//                .get()
//                .getValue();
//
//        List listOfMax = map.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue() == max)
//                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
//
//        if(listOfMax.size() > 1){
//            System.out.print("?");
//        }else {
//            System.out.print(listOfMax.get(0));
//        }

        // 방법 2.
//        char[] str = word.toCharArray();
//        for(char i : str) {
//            map.put(i, map.getOrDefault(i, 0) + 1);
//            if(max < map.get(i)) max = map.get(i);
//        }
//
//        int cnt = 0;
//        char ch = '?';
//        for(Map.Entry<Character, Integer> tmpMap : map.entrySet()) {
//            if(tmpMap.getValue().equals(max)) {
//                cnt++;
//                ch = tmpMap.getKey();
//            }
//        }
//        System.out.print(cnt > 1 ? "?" : ch);

    }
}
