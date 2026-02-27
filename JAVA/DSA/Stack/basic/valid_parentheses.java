package DSA.Stack.basic;

import java.util.Stack;
import java.util.Scanner;

public class valid_parentheses {
// Function to check valid parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } 
            // If closing bracket
            else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack empty → valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter parentheses string: ");
        String input = sc.nextLine();

        boolean result = isValid(input);

        if (result) {
            System.out.println("Valid Parentheses ✅");
        } else {
            System.out.println("Invalid Parentheses ❌");
        }

        sc.close();
    }
}
