package bitwiseOperations;

//문제:
//주어진 정수 배열에서, 홀수 번째 인덱스에 위치한 값들의 합을 구하세요. 비트 연산을 이용해 문제를 풀어보세요.
//
//    입력:
//정수 배열 arr가 주어집니다. (예: {4, 7, 2, 8, 1, 6, 3})
//조건:
//배열의 홀수 번째 인덱스는 1, 3, 5, ...처럼 1부터 시작합니다. 비트 연산을 이용해 이 조건을 만족하는 인덱스의 값들을 더하세요.
//    출력:
//홀수 번째 인덱스에 위치한 값들의 합을 출력하세요.
public class Bit1 {

    public static void main(String[] args){
        int[] arr = {4,7,2,8,1,6,3};
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            if((i&1)==1){
                sum += arr[i];
            }

        }
        System.out.println(sum);
    }
}
