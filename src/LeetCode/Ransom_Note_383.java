package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Ransom_Note_383 {
    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine){
            //리스트 생성
            List<Character> ogCopy = new ArrayList<>();
            //리스트에 ransom 복사
            for(char c : ransomNote.toCharArray()) {
                ogCopy.add(c);
            }

            //매거진을 돌면서 리스트에 비슷한게 있으면 삭제
            for(char c : magazine.toCharArray()){
                for(int i = 0; i<ogCopy.size();i++){
                    if(ogCopy.get(i)==c){
                        ogCopy.remove(i);
                        break;
                    }
                }
            }
            //리스트의 사이즈가 0 이면 true 반환
            if(ogCopy.size()==0){
                return true;
            }
            //반대의 경우 false 반환
            else{
                return false;
            }
        }

    }
    public static void main(String[] args) {
        String ransom = "a";
        String magazine ="b";
        Solution solution = new Solution();
        System.out.println(solution.canConstruct(ransom,magazine));

    }



}
