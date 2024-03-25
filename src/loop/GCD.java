package loop;
//Greatest Common Divisor 최대공약수
public class GCD {
    static int gcd(int a, int b){
        while(b!=0){
            //1.temp = 30
            //2.temp = 6
            int temp = b;
            //1.b = 6
            //2.b = 0
            b = a%b;
            //1.a = 30
            //2.a = 6
            a = temp;
        }
        return a;//6 반환
    }
    public static void main(String[] args) {
        //예시
        int a = 6;
        int b = 30;
        System.out.println(gcd(a,b));
    }
}
