package daily.Daily_routine_20240627;

import java.util.HashMap;

public class 단어빈도세기{
    public static void main(String[] args) {
        String[] words = {"prevention??", "avoidance??", "recovery??", "ignorance??",
            "prevention??"};
        HashMap<String, Integer> Wm = new HashMap<>();

        for (String word : words) {
            Wm.put(word,Wm.getOrDefault(word,0)+1);
        }
        for(String word : Wm.keySet()) {
            int num = Wm.get(word);
            System.out.println(word + ": " + num + "?");

        }

    }

}
