package array;

import java.util.Scanner;

public class LinearSearch {

    static int searchNum(int[] ary, int idx, int num) {
        int i = 0;

        while (true) {
            if (i == idx) {
                System.out.println("찾는 값이 없습니다.");
                return -1;
            }
            if (ary[i] == num) {
                System.out.println("num[" + i + "]이 찾는 값 입니다.");
                return i;
            }
            i++;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = {10, 30, 20, 70, 50, 60, 15};
        System.out.println("검색할 숫자를 입력하세요 : ");

        int num = scanner.nextInt();

        int answer = searchNum(nums, nums.length, num);
        System.out.println(answer);
    }
}


