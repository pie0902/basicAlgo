package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> gennerate(int numRows){
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j<=i; j++){
                if(j==0||j==i) {
                    row.add(1);
                }else{
                    int value = answer.get(i-1).get(j-1) + answer.get(i-1).get(j);
                    row.add(value);
                }
                System.out.print(row.get(j));
            }
            answer.add(row);
            System.out.println();
        }
        return answer;
    }




    public static void main(String[] args){
        List<List<Integer>> a = gennerate(5);

    }

}
