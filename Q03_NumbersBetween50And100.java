import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * Question 03 · Numbers between 50 and 100
 * Integer arrays · The Algorithms Way · algorithms365.com
 *
 * PROBLEM
 *   Return all numbers that are greater than 50 and less than 100.
 *
 *   Sample input to the function:    [45, 67, 100, 52, 99, 120, 50]
 *   Sample return from the function: [67, 52, 99]
 *
 * HOW TO USE THIS FILE
 *   1. Write your code inside findNumbersBetween50And100(...) below. Do not change its signature.
 *   2. The function must RETURN the answer. Do not print it.
 *   3. Compile and run:  javac Q03_NumbersBetween50And100.java  then  java Q03_NumbersBetween50And100
 *      (or run it in one step with:  java Q03_NumbersBetween50And100.java)
 *   4. Fix your code until every test case says PASS.
 */
public class Q03_NumbersBetween50And100 {

    // ======================================================================
    //  Write your solution inside this function.
    // ======================================================================
    public static int[] findNumbersBetween50And100(int[] numbers) {
        if(numbers == null || numbers.length == 0)
        {
            return new int[] {};
        }
        int index = 0;
        int count = 0;
        // int[] newArray = new int[nums.length];
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > 50 && numbers[i] < 100)
            {
                count++;
            }
        }

        int[] newArray = new int[count];
        for(int i = 0; i < numbers.length; i++)
        {
            if(numbers[i] > 50 && numbers[i] < 100)
            {
                newArray[index] = numbers[i];
                index++;
                
            }
        }

        return newArray;
    }

    // ======================================================================
    //  Test cases for findNumbersBetween50And100: run this file to check your code.
    // ======================================================================

    public static void main(String[] args) {
        run(1, "Sample from the question",
                () -> findNumbersBetween50And100(new int[]{45, 67, 100, 52, 99, 120, 50}),
                new int[]{67, 52, 99});
        run(2, "Null input",
                () -> findNumbersBetween50And100((int[]) null),
                new int[]{});
        run(3, "Empty",
                () -> findNumbersBetween50And100(new int[]{}),
                new int[]{});
        run(4, "Nothing qualifies",
                () -> findNumbersBetween50And100(new int[]{10, 50, 100, 200}),
                new int[]{});
        run(5, "Everything qualifies",
                () -> findNumbersBetween50And100(new int[]{51, 75, 99}),
                new int[]{51, 75, 99});
        run(6, "Boundaries exactly 50 and 100",
                () -> findNumbersBetween50And100(new int[]{50, 100}),
                new int[]{});
        run(7, "Just inside: 51 and 99",
                () -> findNumbersBetween50And100(new int[]{50, 51, 99, 100}),
                new int[]{51, 99});
        run(8, "Single number in range",
                () -> findNumbersBetween50And100(new int[]{60}),
                new int[]{60});
        run(9, "Duplicates",
                () -> findNumbersBetween50And100(new int[]{70, 70, 50, 70}),
                new int[]{70, 70, 70});
        run(10, "Negatives and zero",
                () -> findNumbersBetween50And100(new int[]{-60, 0, 60, -99}),
                new int[]{60});
        run(11, "Unsorted: order is kept",
                () -> findNumbersBetween50And100(new int[]{98, 53, 77}),
                new int[]{98, 53, 77});
        run(12, "Extreme values",
                () -> findNumbersBetween50And100(new int[]{Integer.MIN_VALUE, 75, Integer.MAX_VALUE}),
                new int[]{75});

        printSummary();
    }

    // ======================================================================
    //  Test harness: you do not need to change anything below this line.
    // ======================================================================

    private static int passed = 0;
    private static int total = 0;

    private static void run(int number, String category, Supplier<Object> call, Object expected) {
        total++;
        String label = "Test " + number + " (" + category + ")";
        try {
            Object returned = call.get();
            if (matches(expected, returned)) {
                passed++;
                System.out.println("PASS   " + label);
            } else {
                System.out.println("FAIL   " + label);
                System.out.println("         expected: " + show(expected));
                System.out.println("         returned: " + show(returned));
            }
        } catch (UnsupportedOperationException notWritten) {
            System.out.println("TODO   " + label + "  ->  write your code in the function first");
        } catch (Throwable error) {
            System.out.println("ERROR  " + label + "  ->  " + error);
        }
    }

    private static boolean matches(Object expected, Object returned) {
        if (expected instanceof Number && returned instanceof Number
                && !(expected instanceof Character) && !(returned instanceof Character)) {
            return Math.abs(((Number) expected).doubleValue() - ((Number) returned).doubleValue()) < 1e-6;
        }
        if (expected instanceof double[] && returned instanceof double[]) {
            double[] want = (double[]) expected;
            double[] got = (double[]) returned;
            if (want.length != got.length) {
                return false;
            }
            for (int index = 0; index < want.length; index++) {
                if (Math.abs(want[index] - got[index]) >= 1e-6) {
                    return false;
                }
            }
            return true;
        }
        return Objects.deepEquals(expected, returned);
    }

    private static String show(Object value) {
        if (value == null) {
            return "null";
        }
        if (value instanceof int[]) {
            return Arrays.toString((int[]) value);
        }
        if (value instanceof double[]) {
            return Arrays.toString((double[]) value);
        }
        if (value instanceof boolean[]) {
            return Arrays.toString((boolean[]) value);
        }
        if (value instanceof char[]) {
            StringBuilder text = new StringBuilder("[");
            char[] letters = (char[]) value;
            for (int index = 0; index < letters.length; index++) {
                text.append(index == 0 ? "" : ", ").append('\'').append(letters[index]).append('\'');
            }
            return text.append("]").toString();
        }
        if (value instanceof Object[]) {
            return Arrays.deepToString((Object[]) value);
        }
        if (value instanceof Character) {
            return "'" + value + "'";
        }
        return String.valueOf(value);
    }

    private static void printSummary() {
        System.out.println();
        System.out.println(passed + " / " + total + " test cases passed.");
        if (passed == total) {
            System.out.println("All test cases passed. Well done!");
        } else {
            System.out.println("Keep going: fix the failing cases, then run again.");
        }
    }
}
