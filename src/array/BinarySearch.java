package array;

import java.util.Arrays;

public class BinarySearch {
//정렬을 해야지만 사용가능
//시간 복잡도 O(log n)

    static int search(int[] ary, int num) {
        Arrays.sort(ary);
        int left =0;
        int right = ary.length-1;
        while(left<=right){
            int mid = left +(right - left)/2;
            if(ary[mid]==num){
                return mid;
            }
            else if(ary[mid]<num){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] randomAry = {20, 30, 50, 60, 70, 80, 95, 90, 10, 15, 25, 35};
        System.out.println(search(randomAry,20));
        //예시

    }
}
