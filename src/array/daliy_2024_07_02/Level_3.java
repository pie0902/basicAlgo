package array.daliy_2024_07_02;

import java.util.Arrays;

// n개의 숫자가 담긴 배열이 주어집니다. 이 배열에서 k번째로 큰 수를 구하는 함수를 작성하세요.
public class Level_3 {
    public static void main(String[] args) {
        int[] ary = {10, 20, 30, 3, 50};
        int k = 2;
        Arrays.sort(ary);
        System.out.println(ary[k-1]);


    }
}
