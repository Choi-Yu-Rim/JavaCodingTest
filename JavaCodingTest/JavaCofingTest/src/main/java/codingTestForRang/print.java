package codingTestForRang;

import java.io.*;

public class print {
    public static void main(String[] args) throws IOException {
        // BufferedWriter 사용 시 flush와 close 필수
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 방법 1.
//        for(int i=0; i < 5 ; i++){
//            for(int j=0; j < 5; j++){
//                if(i==j){
//                    bw.write("O");
//                }else {
//                    bw.write("o");
//                }
//            }
//            bw.write("\n");
//        }
//
//        for(int i=0; i < 5 ; i++){
//            for(int j=5; j > 0; j--){
//                if(i==j-1){
//                    bw.write("O");
//                }else {
//                    bw.write("o");
//                }
//            }
//            bw.write("\n");
//        }

        // 방법 2.
        String[][] arr1 = new String[5][5]; // 정방향
        String[][] arr2 = new String[4][5]; // 역방향

        for(int i=0; i < arr1.length; i++){
            for(int j=0; j < arr1[0].length; j++){
                if(i == j) {
                    arr1[i][j] = "O";
                }else {
                    arr1[i][j] = "o";
                }
                System.out.print(arr1[i][j]);
            }
            System.out.print("\n");
        }

        for(int i=0; i < arr2.length; i++){
            for(int j=arr2[0].length-1; j >= 0; j--){
                if(i == j-1) {
                    arr1[i][j] = "O";
                }else {
                    arr1[i][j] = "o";
                }
                System.out.print(arr1[i][j]);
            }
            System.out.print("\n");
        }

    }
}
/*
*   Ooooo
    oOooo
    ooOoo
    oooOo
    ooooO
    oooOo
    ooOoo
    oOooo
    Ooooo
*
* */

