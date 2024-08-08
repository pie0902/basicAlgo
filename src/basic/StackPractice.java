package basic;

import java.security.PublicKey;
import java.util.Stack;

//문제
//괄호로 이루어진 문자열이 주어질 때, 각 괄호가 올바르게 짝을 이루고 있는지 확인하는 프로그램을 작성하세요.
//올바른 괄호란 (), {}, [] 형태로 짝을 이루는 것을 의미합니다.
public class StackPractice {
    public static boolean Solution(String str) {
        Stack<Character> check = new Stack();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == '{' || c == '(' || c == '[') {
                check.push(c);
            } else {
                if (check.isEmpty()) {
                    return false;
                }
                char top = check.pop();
                if (c == '}' && top != '{' ||
                    c == ']' && top != '[' ||
                    c == ')' && top != '(') {
                    return false;
                }
            }
        }
        return check.isEmpty();

    }
    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(Solution(str));
    }
}
