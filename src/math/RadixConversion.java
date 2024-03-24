package math;

public class RadixConversion {
    //x 정수
    //r 몇진수로 변환할지

    //리턴 받을 2개의 값
    static class CharAndInt{
        char[] chars;
        int len;
        CharAndInt(char[] chars,int len){
            this.chars = chars;
            this.len = len;
        }
    }
    //진수 변환기
     CharAndInt cardConvR(int x, int r, char[] d) {
         int digits = 0;
         String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         do {
             d[digits++] = dchar.charAt(x % r);
             x /= r;
         } while (x != 0);
         return new CharAndInt(d, digits);
     }
     //배열 역순으로 출력해주는 함수
    public void revers(char[] ary,int len){
        for(int i = len-1; i>=0; i--){
            System.out.print(ary[i]);
        }
    }
    //실행 함수
    public void test() {
        char[] ary = new char[32];
        CharAndInt result = cardConvR(59, 2, ary);
        revers(result.chars,result.len);
    }
    //메인 함수
    public static void main(String[] args) {
        RadixConversion radixConversion = new RadixConversion();
        radixConversion.test();
    }
}
