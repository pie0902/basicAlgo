package recursion;

public class ArraySum {

    public static int sum(int[] ary, int num) {
        if(num == ary.length) {
            return 0;  // 기본 케이스: 배열 끝에 도달하면 0 반환
        } else {
            return ary[num] + sum(ary, num + 1);  // 현재 값과 나머지 배열의 합 계산
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr, 0));  // 배열 합 계산 시작 (인덱스 0부터)
    }
}
