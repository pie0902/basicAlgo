package array;

import java.util.Random;

public class ReverseArraySorting{
    //배열 길이
    int num = 5;
    //난수 생성
    Random random = new Random();
    int[] nums = new int[num];
    public void mkRan() {
        for(int i = 0; i<num; i++){
            nums[i] = random.nextInt(100)+1;
        }
    }
    public void swap(int[] a,int idx1,int idx2){
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp ;
    }
    public void revers(){
        for(int i = 0; i<num/2;i++){
            swap(nums,i,num-i-1);
        }
    }
    public void test(){
        mkRan();
        for(int i = 0; i<num;i++){
            System.out.println(nums[i]);
        }
        System.out.println("==============================");
        revers();
        for(int i = 0; i<num;i++){
            System.out.println(nums[i]);
        }
    }
}
