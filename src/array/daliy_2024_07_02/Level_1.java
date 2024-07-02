package array.daliy_2024_07_02;

//n개의 숫자가 담긴 배열이 주어집니다. 이 배열에서 가장 큰 수와 가장 작은 수의 차이를 구하는 함수를 작성하세요.
public class Level_1 {



    public static void main(String[] args) {
        int[] ary = {20, 30, 50, 60, 70, 80, 95, 90, 10, 15, 25, 35};
        int max = 0;
        int min = 999;
        for(int i = 0; i<ary.length;i++){
            if(ary[i]>max){
                max = ary[i];
            }
            if(ary[i]<min){
                min = ary[i];
            }
        }
        System.out.println(max-min);

    }
}
