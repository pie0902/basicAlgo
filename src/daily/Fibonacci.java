package daily;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        int one = 1;
        int two = 1;
        int result = 0;
        if(n==1 || n==2) {
            result = 1;
        }
        else {
            for(int i = 3; i<= n; i++){
                result = one + two;
                one = two;
                two = result;
            }
        }

        System.out.println(result);
    }
}
