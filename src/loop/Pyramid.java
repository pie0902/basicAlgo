package loop;

public class Pyramid {
    public void test(){
        String s = "*";
        for(int i = 1; i<=5; i++) {
            for (int j = 5-i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1 ; k <=i+(i - 1); k++) {
                System.out.print("a");

            }
            System.out.println();
        }

    }

}
