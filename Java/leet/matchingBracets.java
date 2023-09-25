import java.util.Stack;

public class matchingBracets {
    public static boolean isOpening(char c){
        return (c == '(' || c == '{' || c == '[');
    };
    public static boolean isMatching(char c1, char c2){
        return ((c1==')' && c2=='(') || (c1=='}' && c2=='{') || (c1==']' && c2=='['));
    };
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            char cur = s.charAt(i);
            if(isOpening(cur)){
                stack.push(cur);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else if(!isMatching(cur, stack.peek())){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }        
        return stack.isEmpty();
    };
    public static void main(String[] args) {
        boolean ans = isValid(")()");
        System.out.println(ans);
    }
}
