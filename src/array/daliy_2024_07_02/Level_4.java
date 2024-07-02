package array.daliy_2024_07_02;

import java.util.Arrays;
//n개의 숫자가 담긴 배열 nums와 정수 k가 주어집니다. 이 배열에서 연속된 k개의 숫자의 합이 가장 큰 경우의 합을 구하는 함수를 작성하세요.
public class Level_4 {
    public static void main(String[] args) {
        int[] ary = {1,2,3,4,5};
        int k = 3;
        int answer = 0;
        int[] array = new int[k];
        int idx = 0;
        for(int i = 0; i<=ary.length-k;i++) {
            int temp = 0;
            for (int j = i; j <=i+k-1; j++) {
                temp = temp + ary[j];
            }
            array[idx] = temp;
            idx++;
        }
        Arrays.sort(array);
        System.out.println(array[k-1]);
    }
}
