package dfs;

import java.util.ArrayList;
import java.util.List;

public class Dfs2{
    static List<List<Integer>> result = new ArrayList<>();
    public static void dfs(int[] ary,boolean[] v, List<Integer> list) {
        result.add(new ArrayList<>(list));
        System.out.println(list);
        for (int i = 0; i < ary.length; i++) {
            if (!v[i]) {
                v[i] = true;
                list.add(ary[i]);
                dfs(ary, v, list);
                v[i] = false;
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7};
        boolean[] v = new boolean[arr.length];
        List<Integer> list = new ArrayList<>();
        dfs(arr,v,list);
        for(List<Integer> l : result){
            System.out.println(l);
        }
    }
}
