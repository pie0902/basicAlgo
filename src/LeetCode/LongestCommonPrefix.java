package LeetCode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        //첫번째 단어
        String prefix = strs[0];

        for(int i = 0; i<prefix.length(); i++){
            //현재 문자
            char c = prefix.charAt(i);
            for(int j = 1; j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=c){
                    return prefix.substring(0,i);
                }
            }

        }
        return prefix;

    }
    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        longestCommonPrefix(strs);
    }
}
