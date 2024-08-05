package org.example;


//Task 3: built-in Java Functional Interfaces
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

//Task 1: created a Functional Interface for lambda expressions (adding, subtra...)
@FunctionalInterface
interface Operation{
    int perform(int a, int b);
}

//Task 2: Created a Functional Interface for a StringOperation
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

//lambda expressions uses two instances: concatenate (links together two words) and findLonger (finds the longest word)
        StringOperation concatenate = (a, b) -> a + b;
        StringOperation findLonger = (a, b) -> a.length() >= b.length() ? a : b;

        System.out.println(concatenate.perform("Hello, ", "Charlie"));
        System.out.println(findLonger.perform("Hello", "Charlie"));

//task3: use of lambda expressions with built-in functional interfaces at top
        //commonly used for filtering or matching conditions//
/*public class PredicateExample {
    public static void main(String[] args) {   is boolean */

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isNegative = n -> n < 0;
        System.out.println(isPositive.test(1));
        System.out.println(isNegative.test(1));

        /*The Function Interface represents a fx that takes one argument
         * and produces a result - often used for transforming data*/
        /*//Example, converting string to its length:
         * public class FunctionExample {
         * public static void main(String[] args) { */
        Function<String, Integer> stringLength = s -> s.length();


        System.out.println(stringLength.apply("Hello"));
        System.out.println(stringLength.apply("Charlie"));


  /*Consumer Interface - accepts a single input argument and returns no result.
  used for - operations that perform some action on an input i.e., printing, modifying an object.
  processing collections, chaining operations
  Example: printing a string
  public class ConsumerExample {
    public static void main(String[] args) {*/
        Consumer<String> print = s -> System.out.println(s);
        print.accept("Hiya");

/*Supplier Interface - does NOT take arguments, ONLY returns result.
public class SupplierExample {
    public static void main(String[] args) {*/
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get());


        }
}


