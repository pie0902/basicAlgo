package daily.Daily_routine_20240627;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//학생 점수 관리: 학생의 이름을 키로, 점수를 값으로 하는 HashMap을 생성하세요.
// 학생 이름과 점수를 입력받아 HashMap에 저장하고, 학생 이름을 입력받아 해당 학생의 점수를 출력하는 프로그램을 작성하세요.
public class 학생점수관리 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name="";
        Map<String,Integer> note = new HashMap<>();
        while(!name.equals("stop")) {
            System.out.print("이름을 입력하세요: ");
            name = scanner.nextLine();

            if(!name.equals("stop")) {
                System.out.print("점수를 입력하세요: ");
                int score = scanner.nextInt();
                scanner.nextLine();
                note.put(name, score);
            }
        }

        for(String printName: note.keySet()){
            int score = note.get(printName);
            System.out.println(printName +": "+score);
        }
    }
}
