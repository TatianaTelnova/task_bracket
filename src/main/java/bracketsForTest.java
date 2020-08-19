import java.util.ArrayList;
import java.util.Stack;

public class bracketsForTest {
    public static Boolean Predict(String input) {
        ArrayList<Character> brackets = new ArrayList<Character>();
        for (char c : input.toCharArray()) { // convert string input to char
            brackets.add(c);
        }
        Stack<Character> result = new Stack<>();
        for (char symbol : brackets) {
            if (symbol == '(' || symbol == '[' || symbol == '{') {
                result.push(symbol);
            } else {
                if (result.empty() == false) {
                    if (result.peek() == '(' && symbol == ')' || result.peek() == '[' && symbol == ']' || result.peek() == '{' && symbol == '}') {
                        result.pop(); // delete element
                    }
                }
            }
        }
        if (result.empty() == true) {
            return true;
        } else {
            return false;
        }
    }
}


