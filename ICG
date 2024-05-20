import java.util.Scanner;
import java.util.Stack;
public class Main {
// Method to generate intermediate code for arithmetic expressions
public static String generateIntermediateCode(String expression) {
StringBuilder intermediateCode = new StringBuilder();
Stack<Character> operators = new Stack<>();
for (int i = 0; i < expression.length(); i++) {char currentChar = expression.charAt(i);
if (Character.isDigit(currentChar)) {
intermediateCode.append("PUSH
").append(currentChar).append("\n");
} else if (currentChar == '+' || currentChar == '-' || currentChar == '*' ||
currentChar == '/') {
while (!operators.isEmpty() && precedence(operators.peek()) >=
precedence(currentChar)) {
intermediateCode.append("POP temp\n");
intermediateCode.append("POP temp2\n");
intermediateCode.append("OPERATION
").append(operators.pop()).append(" temp2 temp\n");
intermediateCode.append("PUSH temp\n");
}
operators.push(currentChar);
}
}
while (!operators.isEmpty()) {
intermediateCode.append("POP temp\n");
intermediateCode.append("POP temp2intermediateCode.append("OPERATION
").append(operators.pop()).append(" temp2 temp\n");
intermediateCode.append("PUSH temp\n");
}
return intermediateCode.toString();
}
// Method to determine precedence of operators
private static int precedence(char operator) {
if (operator == '+' || operator == '-') {
return 1;
} else if (operator == '*' || operator == '/') {
return 2;
}
return 0;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
while (true) {System.out.print("Enter an arithmetic expression (or type 'exit' to quit):
");
String expression = scanner.nextLine();
if (expression.equalsIgnoreCase("exit")) {
break;
}
String intermediateCode = generateIntermediateCode(expression);
System.out.println("Intermediate Code:");
System.out.println(intermediateCode);
}
scanner.close();
}
}
