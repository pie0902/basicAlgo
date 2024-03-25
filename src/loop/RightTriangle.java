package loop;

public class RightTriangle {
    public static void test() {
        String s = "*";
        for(int i = 0; i<=5; i++){
            for(int j = 0; j<i;j++){
                System.out.print(s);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //예시
        RightTriangle.test();
    }

}
