public class everyoperator {
    public static void main(String[] args) {
        // Arithmetic operators
        int a = 10, b = 5;
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Relational operators
        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreaterThan = (a > b);
        boolean isLessThan = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("\nRelational Operators:");
        System.out.println("Equal: " + isEqual);
        System.out.println("Not Equal: " + isNotEqual);
        System.out.println("Greater Than: " + isGreaterThan);
        System.out.println("Less Than: " + isLessThan);
        System.out.println("Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Less or Equal: " + isLessOrEqual);

        // Logical operators
        boolean logicalAnd = (a > 0) && (b > 0);
        boolean logicalOr = (a > 0) || (b > 0);
        boolean logicalNot = !(a > b);

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND: " + logicalAnd);
        System.out.println("Logical OR: " + logicalOr);
        System.out.println("Logical NOT: " + logicalNot);

        // Assignment operators
        int c = a; // Simple assignment
        c += b; // Addition assignment
        c -= b; // Subtraction assignment
        c *= b; // Multiplication assignment
        c /= b; // Division assignment
        c %= b; // Modulus assignment

        System.out.println("\nAssignment Operators:");
        System.out.println("c after assignments: " + c);

        // Bitwise operators
        int bitwiseAnd = a & b;
        int bitwiseOr = a | b;
        int bitwiseXor = a ^ b;
        int bitwiseComplement = ~a;
        int leftShift = a << 1;
        int rightShift = a >> 1;
        int zeroFillRightShift = a >>> 1;

        System.out.println("\nBitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement: " + bitwiseComplement);
        System.out.println("Left Shift: " + leftShift);
        System.out.println("Right Shift: " + rightShift);
        System.out.println("Zero-fill Right Shift: " + zeroFillRightShift);
    }
}
