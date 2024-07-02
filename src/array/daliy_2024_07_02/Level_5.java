package array.daliy_2024_07_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


//n개의 숫자가 담긴 배열이 주어집니다. 이 배열에서 각 숫자의 등장 횟수를 구하고, 가장 많이 등장한 숫자를 구하는 함수를 작성하세요.
public class Level_5 {
    public static class Dummy{
        int index;
        int value;
        public Dummy(int index,int value){
            this.index = index;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        int[] ary = {1,2,2,2,2,3,3,3};
        int idx = 1;
        Set<Integer> set = new HashSet<>();

        for(int i : ary) {
            set.add(i);
        }
        List<Dummy> dummy = new ArrayList<>();
        for(int i : set) {
            int cnt = 0;
            for (int j = 0; j < ary.length; j++) {
                if (i == ary[j]) {
                    cnt++;

                }
            }
            Dummy d = new Dummy(idx, cnt);
            dummy.add(d);
            idx++;
        }
        int max = 0;
        for(Dummy a : dummy) {
            if (a.value > max) {
                max = a.value;
            }
        }
        for(Dummy a : dummy){
            if(a.value == max){
                System.out.println(a.index);
            }
        }





    }
}
