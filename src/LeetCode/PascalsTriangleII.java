package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

    public static List<List<Integer>> cul(int n){
        List<List<Integer>> lists = new ArrayList<>();
        for(int i = 0; i<n; i++){
            List<Integer> a = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j==0||j==i){
                    a.add(1);
                }else{
                    int value = lists.get(i-1).get(j-1) + lists.get(i-1).get(j);
                    a.add(value);
                }
            }
            lists.add(a);
        }
        return lists;
    }




    public static void main(String[] args) {
        List<List<Integer>> z = cul(3);
        for(int i = 0; i<z.size(); i++){
            System.out.println(z.get(i));
        }
    }
}
