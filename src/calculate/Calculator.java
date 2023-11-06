package calculate;

/**
 * 1. Write a java program using the following descriptions
 * 1. Create one package with name calculate
 * 2. Create two class with name “Calculator” and “Main”
 * 3. Create four methods with manes “addition”, “subtraction”, “division”, and “multiplication”.
 * All methods are instance methods and it doesn’t return anything. But it has two parameters with the names “int a” and “int b”.
 * Also each method has System.out.println(). This prints the result. Also create one more method with the name “calculateResult”
 * with three parameters with name int a, int b and char symbol. Write the logic in the calculateResult method that
 * when the user enters first number and second number and symbol based on symbol it does calculate.
 */
public class Calculator {
    //Creating Two parameters
    int a;
    int b;

    //Created four instance method
    public void addition(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a + b;
        System.out.println("\nAddition os " + a + " + " + b + " = " + ans);
    }

    public void subtraction(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a - b;
        System.out.println("\nSubtraction of " + a + " + b + " + " = " + ans);
    }

    public void division(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a / b;
        System.out.println("\nDivision of " + a + " / " + b + " = " + ans);
    }

    public void multiplication(int a, int b) {
        this.a = a;
        this.b = b;
        int ans = a * b;
        System.out.println("\nMultiplication od " + a + " + b + " + " = " + ans);
    }
    //
    public void calculateResult(int a, int b, char c) {

        if (c == '+') {
            addition(this.a = a, this.b = b);

        } else if (c == '-') {
            subtraction(this.a = a, this.b = b);

        } else if (c == '/') {
            division(this.a = a, this.b = b);
        } else if (c == '*') {
            multiplication(this.a = a, this.b = b);
        }

    }

}






