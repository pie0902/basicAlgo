package recursion;

public class Factorial {
    //자연수 n이 주어졌을 때 !n을 구하는 함수를 만들어 주세요.
    static int n = 5;
    //5*4*3*2*1
    public static int solution(int n){
        if(n<=1){
            return n;
        }
        else{
            return solution(n-1) * n;
        }
    }

    public static void main(String[] args){
        int answer = solution(n);
        System.out.println(answer);
    }
}
