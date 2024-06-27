package daily.Daily_routine_20240627;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//애너그램 그룹화:
// 문자열 배열 strs가 주어졌을 때, 애너그램(문자를 재배열하여 다른 단어를 만들 수 있는 단어)끼리 그룹화하는 프로그램을 작성하세요.
// HashMap을 사용하여 애너그램 그룹을 관리하고, 결과를 출력하세요.
public class 그룹화 {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String,List<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortStr = new String(chars);

            if (!map.containsKey(sortStr)) {
                map.put(sortStr, new ArrayList<>());
            }
            map.get(sortStr).add(str);
        }
        for(Map.Entry<String,List<String>> entry: map.entrySet()){
            String key = entry.getKey();
            List<String> value = entry.getValue();
            System.out.println(key + " " + value);
        }
    }
}
