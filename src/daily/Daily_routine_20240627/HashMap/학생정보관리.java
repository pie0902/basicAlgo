package daily.Daily_routine_20240627.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashMap;



//학생 이름을 저장한 문자열 배열 String[] names = {"John", "Emily", "Michael", "Jessica"}가 주어집니다.
//학생 점수를 저장한 정수 배열 int[] scores = {85, 92, 78, 90}이 주어집니다.
//학생 이름을 키(key)로, 학생의 점수를 값(value)으로 하는 HashMap을 생성하고, 주어진 배열을 이용하여 HashMap에 데이터를 저장하세요.
//    HashMap에서 "Michael"의 점수를 출력하세요.
//HashMap에 저장된 모든 학생의 이름과 점수를 출력하세요.

public class 학생정보관리 {

    public static void main(String[] args) {
        String[] names = {"John", "Emily", "Michael", "Jessica"};
        int[] scores = {85, 92, 78, 90};
        Map<String, Integer> list = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            list.put(names[i], scores[i]);
        }
        System.out.println("Michael의 점수: " + list.get("Michael"));
        for(Map.Entry<String,Integer> entry: list.entrySet()){
            String n = entry.getKey();
            int s = entry.getValue();
            System.out.println(n + " 의 점수: " + s);
        }

    }
}
