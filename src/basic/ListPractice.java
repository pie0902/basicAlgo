package basic;



//문제
//주어진 정수를 역순으로 저장하는 리스트를 작성하는 프로그램을 구현하세요. 사용자로부터 정수들을 입력받고,
//이를 역순으로 저장한 뒤 출력하는 프로그램입니다.

//입력 예시
//5
//1 2 3 4 5

import java.util.ArrayList;
import java.util.List;

//출력 예시
//5 4 3 2 1
public class ListPractice {
    public static List<Integer> Solution(int n){
        List<Integer> nums = new ArrayList<>();
        for(int i = n; i>0; i--){
            nums.add(i);
        }
        return nums;
    }
    public static void main(String[] args) {
        int n = 5;
        List<Integer> numList = Solution(n);
        for(int i :numList){
            System.out.println(i);
        }
    }
}
