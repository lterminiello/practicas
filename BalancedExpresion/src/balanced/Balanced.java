package balanced;

import java.util.Stack;

public class Balanced {
	public static void main(String[] args) {
		System.out.println(evalExpression(args[0]));
	}

	public static boolean evalExpression(String expression) {
		Stack<Character> stackDelimiters = new Stack<Character>();
		for (Character charExpression : expression.toCharArray()) {
			switch (charExpression) {
			case '{':
			case '[':
			case '(':
				stackDelimiters.push(charExpression);
				break;
			case '}':
				if (!stackDelimiters.isEmpty() && stackDelimiters.peek() == '{') {
					stackDelimiters.pop();
				}else{
					return false;
				}
				break;
			case ']':
				if (!stackDelimiters.isEmpty() && stackDelimiters.peek() == '[') {
					stackDelimiters.pop();
				}else{
					return false;
				}
				break;
			case ')':
				if (!stackDelimiters.isEmpty() && stackDelimiters.peek() == '(') {
					stackDelimiters.pop();
				}else{
					return false;
				}
				break;
			default:
				break;
			}
		}
		System.out.println(stackDelimiters);
		return stackDelimiters.isEmpty();
	}
}
