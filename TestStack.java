public class TestStack {

    static int passed = 0;
    static int failed = 0;

    static void check(String name, int expected, int actual)
    {
        if (expected == actual)
        {
            passed++;
            System.out.println("PASS: " + name);
        }
        else
        {
            failed++;
            System.out.println("FAIL: " + name + " (expected " + expected + ", got " + actual + ")");
        }
    }

    public static void main(String[] args) {
        MyStackOld myStack = new MyStackOld(5);

        // Empty stack
        check("pop on empty stack", -1, myStack.pop());
        check("peek on empty stack", -1, myStack.peek());
        myStack.print();

        // Push and peek
        myStack.push(5);
        check("peek after one push", 5, myStack.peek());
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);
        check("peek on full stack", 1, myStack.peek());
        myStack.print();

        // Overflow: push onto a full stack must not change the top
        myStack.push(99);
        check("peek after overflow push", 1, myStack.peek());

        // Pop everything: values come back in LIFO order
        check("pop 1", 1, myStack.pop());
        check("pop 2", 2, myStack.pop());
        check("pop 3", 3, myStack.pop());
        check("pop 4", 4, myStack.pop());
        check("pop 5", 5, myStack.pop());

        // Stack is empty again
        check("pop after emptying", -1, myStack.pop());

        // Stack is reusable after emptying
        myStack.push(42);
        check("peek after reuse", 42, myStack.peek());

        System.out.println();
        System.out.println(passed + " passed, " + failed + " failed");
    }
}
