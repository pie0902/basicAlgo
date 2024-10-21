package dfs;

import java.util.ArrayList;
import java.util.List;

public class Dfs1 {
    public static void dfs(int[] ary, boolean[] v,List<Integer> list) {
        //종료조건
        if (list.size() == ary.length) {
            System.out.println(list);
            return;
        }
        for (int i = 0; i < ary.length; i++) {
            if (!v[i]) {
                v[i] = true;
                list.add(ary[i]);
                dfs(ary, v, list);
                v[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        int[] ary = {1,2,3};
        boolean[] v = new boolean[ary.length];

        dfs(ary,v,list);
        System.out.println("탐색 종료1");
    }
}
