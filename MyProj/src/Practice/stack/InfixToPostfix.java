package Practice.stack;

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) throws Exception {
		//String input = "a+b*c+d"; //abc*+d+
//		String input = "a+b*(c^d-e)^(f+g*h)-i";
		String input = "a*b-c+d*e/f+g*h-i"; // ab*c-de*f/+gh*+i-
		System.out.println(convert(input));

	}

	public static String convert(String input) throws Exception {
		Stack<Character> stack = new Stack<>();
		String out = "";
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (!isOperator(c)) {
				out += c;
				continue;
			}
			if (stack.isEmpty()) {
				stack.push(c);
			} else if (isHigherPrec(c, stack.peek())) {
				stack.push(c);
			} else {
				while (!stack.isEmpty()) {
					out += stack.pop();
				}
				stack.push(c);
			}
		}
		while(!stack.isEmpty()) {
			out+=stack.pop();
		}
		return out;
	}

	public static boolean isOperator(char c) {
		return prec(c) != -1;
	}

	public static boolean isHigherPrec(char op1, char op2) {
		return prec(op1) > prec(op2);
	}

	static int prec(char op) {
		switch (op) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;
		}
		return -1;
	}
}
