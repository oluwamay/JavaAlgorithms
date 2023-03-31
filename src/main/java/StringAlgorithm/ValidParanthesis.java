package StringAlgorithm;

import java.util.Stack;

public class ValidParanthesis {
    /**
     * https://leetcode.com/problems/valid-parentheses/submissions/915346880/
     *
     */
    public static void main(String[] args) {

    }

        public static boolean isValid(String s) {

            Stack<Character> keep = new Stack<>();
            for(int i = 0; i < s.length(); i++){

                if(s.charAt(i) == '('||s.charAt(i) == '['||s.charAt(i) == '{'){
                    keep.push(s.charAt(i));
                }else if(s.charAt(i) == ')'||s.charAt(i) == ']'||s.charAt(i) == '}'){
                    if(keep.isEmpty()){
                        //if stack is empty then there is no match
                        return false;
                    }else if(s.charAt(i) == ')' && keep.peek() == '('){
                        //remove valid pair
                        keep.pop();
                    }else if(s.charAt(i) == ']' && keep.peek() == '['){
                        //remove valid pair
                        keep.pop();
                    }else if(s.charAt(i) == '}' && keep.peek() == '{'){
                        //remove valid pair
                        keep.pop();
                    }else{
                        //the next paranthesis is invalid
                        return false;
                    }
                }

            }
            return keep.isEmpty(); //if it is empty we had a valid string
        }

}
