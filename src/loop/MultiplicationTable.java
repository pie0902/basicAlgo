package loop;

public class MultiplicationTable {
    public static void loop(){
        System.out.print(" ");
        for(int i = 1; i<=9; i++){
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("=".repeat(36));
        for(int i = 1; i<=9; i++){
            System.out.printf("%d", i);
            for(int j = 1; j<=9; j++){
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        //예시

        MultiplicationTable.loop();
    }
}
