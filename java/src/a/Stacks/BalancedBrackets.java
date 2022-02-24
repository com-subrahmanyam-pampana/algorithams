package a.Stacks;
import java.util.*;

public class BalancedBrackets {

	
	// function to check if brackets are balanced
    static boolean areBracketsBalanced(String expr)
    {
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                // Push the element in the stack
                stack.push(x);
                continue;
            }
 
            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        // Check Empty Stack
        return (stack.isEmpty());
    }
    
    
 // Function to find duplicate parenthesis in an expression
    public static boolean hasDuplicateParenthesis(String exp)
    {
        if (exp == null || exp.length() <= 3) {
            return false;
        }
 
        // take an empty stack of characters
        Stack<Character> stack = new Stack<>();
 
        // traverse the input expression
        for (char c: exp.toCharArray())
        {
            // if the current char in the expression is not a closing parenthesis
            if (c != ')') {
                stack.push(c);
            }
            // if the current char in the expression is a closing parenthesis
            else {
                // if the stack's top element is an opening parenthesis,
                // the subexpression of the form ((exp)) is found
                if (stack.peek() == '(') {
                    return true;
                }
 
                // pop till '(' is found for current ')'
                while (stack.peek() != '(') {
                    stack.pop();
                }
 
                // pop '('
                stack.pop();
            }
        }
 
        // if we reach here, then the expression does not have any
        // duplicate parenthesis
        return false;
    }
    
    // Driver code
    public static void main(String[] args)
    {
        String expr = "([{}])";
 
        // Function call
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}



