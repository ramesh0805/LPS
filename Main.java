import java.util.Scanner;public class Main {
private static int[] stack;
private static int top;
private static int capacity;
public Main(int size) {
capacity = size;
stack = new int[capacity];
top = -1;
}
public static void push(int item) {
if (top == capacity - 1) {
System.out.println("Stack Overflow! Cannot push " + item);
return;
}
stack[++top] = item;
System.out.println("Pushed " + item + " into the stack");
}
public static int pop() {if (top == -1) {
System.out.println("Stack Underflow! Cannot pop");
return -1;
}
int item = stack[top--];
System.out.println("Popped " + item + " from the stack");
return item;
}
public static void displayStack() {
if (top == -1) {
System.out.println("Stack is empty");
return;
}
System.out.println("Elements in the stack:");
for (int i = top; i >= 0; i--) {
System.out.println(stack[i]);
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);System.out.println("Enter the size of the stack:");
int size = scanner.nextInt();
Main stack = new Main(size);
System.out.println("Stack Operations:");
System.out.println("1. Push");
System.out.println("2. Pop");
System.out.println("3. Display Stack");
System.out.println("4. Exit");
int choice;
do {
System.out.println("Enter your choice:");
choice = scanner.nextInt();
switch (choice) {
case 1:
System.out.println("Enter the element to push:");
int element = scanner.nextInt();
push(element);
break;
case 2:int poppedElement = pop();
if (poppedElement != -1) {
System.out.println("Popped Element: " + poppedElement);
}
break;
case 3:
displayStack();
break;
case 4:
System.out.println("Exiting...");
break;
default:
System.out.println("Invalid choice. Please enter a valid option.");
}
} while (choice != 4);
scanner.close();
}
}
