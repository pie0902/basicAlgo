package array.daliy_2024_07_02;

import java.util.HashSet;
import java.util.Set;

//n개의 숫자가 담긴 배열이 주어집니다. 이 배열에서 중복된 숫자를 제거하고 남은 숫자의 개수를 구하는 함수를 작성하세요.
public class Level_2 {



    public static void main(String[] args) {
        int[] ary = {10, 20, 30, 30,10};
        Set<Integer> set = new HashSet<>();
        for(int i : ary){
            set.add(i);
        }
        System.out.println(set.size());

    }
}
