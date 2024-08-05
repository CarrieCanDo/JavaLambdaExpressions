package org.example;

//created a Functional Interface for lambda expressions (adding, subtra...)
@FunctionalInterface
interface Operation{
    int perform(int a, int b);
}

//Created a Functional Interface for a StringOperation
@FunctionalInterface
interface StringOperation {
    String perform(String a, String b);
}

/*Create Lambda Expressions that perform
addition, subtraction, multiply, and divide.*/

public class Main {
    public static void main(String[] args) {
        Operation add = (a, b) -> a + b;
        Operation subtract = (a, b) -> a - b;
        Operation multiply = (a, b) -> a * b;
        Operation divide = (a, b) -> a / b;

        System.out.println(add.perform(1, 2));
        System.out.println(subtract.perform(1, 2));
        System.out.println(multiply.perform(1, 2));
        System.out.println(divide.perform(1, 2));

    StringOperation concatenate = (a, b) -> a + b;
    StringOperation findLonger = (a, b) -> a.length() >= b.length() ? a : b;

        System.out.println(concatenate.perform("Hello, ", "Charlie"));
        System.out.println(findLonger.perform("Hello", "Charlie"));
    }
}


