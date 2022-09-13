import java.util.Stack;
import java.util.LinkedList;

public class App {
    public static void main(String[] args) {

        // ARRAY (50 points)
        System.out.println("======================================================");
        // 1. Create an array of characters of your SURNAME.
        char[] surname = { 'C', 'I', 'N', 'C', 'O'};

        // 2. Display each character of your SURNAME on each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }

        // 3. Display the first character of your SURNAME.
        System.out.println(surname[0]);

        // 4. Display the last character of your SURNAME.
        System.out.println(surname[4]);

        // 5. Display the character of your SURNAME in reverse order.
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        }

        // LINKED LIST (25 points)
        System.out.println("======================================================");
        // 1. Create a Linked list of the six numbers of your STUDENT NUMBER.
        LinkedList<String> studentNumber = new LinkedList<>();

        studentNumber.add("1");
        studentNumber.add("0");
        studentNumber.add("7");
        studentNumber.add("7");
        studentNumber.add("1");
        studentNumber.add("7");

        // 2. Add an asterisk (*) to the head/front of the Linked list.
        studentNumber.addFirst("*");

        // 3. Add an asterick (*) to the tail/end of the Linked list.
        studentNumber.addLast("*");

        // 4. Display the Linked list.
        System.out.println(studentNumber);

        // 5. Display the last character of the Linked list.
        System.out.println(studentNumber.get(6));

        // 6. Replace the last character of the Linked list with the exclamation symbol (!).
        studentNumber.set(6, "!");

        // 7. Remove the first character of the Linked list.
        studentNumber.remove(0);

        // 8. Display the Linkedlist.
        System.out.println(studentNumber);

        // STACK (25 points)
        System.out.println("======================================================");
        // 1. Create a Stack of characters of your SURNAME.

        Stack<String> surName = new Stack<>();

        surName.push("C");
        surName.push("I");
        surName.push("N");
        surName.push("C");
        surName.push("O");

        // 2. Print the Stack.
        System.out.println(surName);

        // 3. Add a "INF214" to the stack.
        surName.push(" ");
        surName.push("I");
        surName.push("N");
        surName.push("F");
        surName.push("2");
        surName.push("1");
        surName.push("4");

        // 4. Print the Stack.
        System.out.println(surName);

        // 5. Remove "INF214".
        surName.pop();
        surName.pop();
        surName.pop();
        surName.pop();
        surName.pop();
        surName.pop();

        // 6. Add "CCDATRCL-INF214".
        surName.push("C");
        surName.push("C");
        surName.push("D");
        surName.push("A");
        surName.push("T");
        surName.push("R");
        surName.push("C");
        surName.push("L");
        surName.push("-");
        surName.push("I");
        surName.push("N");
        surName.push("F");
        surName.push("2");
        surName.push("1");
        surName.push("4");

        // 7. Print the Stack
        System.out.println(surName);
    }
}