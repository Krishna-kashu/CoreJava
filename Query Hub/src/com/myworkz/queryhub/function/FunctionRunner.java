package com.myworkz.queryhub.function;

import java.util.function.*;

public class FunctionRunner {
    public static void main(String[] args) {

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println("running accept in BiConsumer");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        };
        biConsumer.accept("Ela", 21);

        BiFunction<Double, Double, Double> biFunction = (dividend, divisor) -> {
            System.out.println("running apply in BiFunction");
            return dividend / divisor;
        };
        Double result = biFunction.apply(10.0, 2.0);
        System.out.println("BiFunction result: " + result);

        BiPredicate<Integer, Integer> biPredicate = (num1, num2) -> {
            System.out.println("running test in BiPredicate");
            return num1.equals(num2);
        };
        System.out.println("BiPredicate result: " + biPredicate.test(11, 23));

        BooleanSupplier booleanSupplier = () -> {
            System.out.println("running getAsBoolean in BooleanSupplier");
            return true;
        };
        System.out.println("BooleanSupplier result: " + booleanSupplier.getAsBoolean());

        Consumer<String> consumer = (name) -> {
            System.out.println("running accept in Consumer");
            System.out.println("Name: " + name);
        };
        consumer.accept("Ela");

        DoubleBinaryOperator doubleBinaryOperator = (left, right) -> {
            System.out.println("running applyAsDouble in DoubleBinaryOperator");
            return left + right;
        };
        System.out.println("DoubleBinaryOperator result: " + doubleBinaryOperator.applyAsDouble(10.0, 30.0));

        DoubleConsumer doubleConsumer = (v) -> {
            System.out.println("running accept in DoubleConsumer");
            System.out.println("value: " + v);
        };
        doubleConsumer.accept(30.0);

        DoubleFunction<Double> doubleFunction = (value) -> {
            System.out.println("running apply in DoubleFunction");
            return value;
        };
        System.out.println("DoubleFunction result: " + doubleFunction.apply(15.0));

        DoublePredicate doublePredicate = (value) -> {
            System.out.println("running test in DoublePredicate");
            return value == 11.09;
        };
        System.out.println("DoublePredicate result: " + doublePredicate.test(11.09));

        DoubleSupplier doubleSupplier = () -> {
            System.out.println("running getAsDouble in DoubleSupplier");
            return 100.999;
        };
        System.out.println("DoubleSupplier result: " + doubleSupplier.getAsDouble());

        DoubleToIntFunction doubleToIntFunction = (price) -> {
            System.out.println("running applyAsInt in DoubleToIntFunction");
            return (int) price;
        };
        System.out.println("DoubleToIntFunction result: " + doubleToIntFunction.applyAsInt(20.999));

        DoubleToLongFunction doubleToLongFunction = (value) -> {
            System.out.println("running applyAsLong in DoubleToLongFunction");
            return (long) value;
        };
        System.out.println("DoubleToLongFunction result: " + doubleToLongFunction.applyAsLong(459.8765));

        DoubleUnaryOperator doubleUnaryOperator = (operand) -> {
            System.out.println("running applyAsDouble in DoubleUnaryOperator");
            return operand * operand;
        };
        System.out.println("DoubleUnaryOperator result: " + doubleUnaryOperator.applyAsDouble(3456));

        IntBinaryOperator intBinaryOperator = (left, right) -> left + right;
        System.out.println("IntBinaryOperator result: " + intBinaryOperator.applyAsInt(25, 78));

        IntConsumer intConsumer = (value) -> {
            System.out.println("running accept in IntConsumer");
            System.out.println("value: " + value);
        };
        intConsumer.accept(290);

        IntFunction<String> intFunction = (value) -> {
            System.out.println("running apply in IntFunction");
            return value > 18 ? "Valid age to vote" : "Cannot vote";
        };
        System.out.println("IntFunction result: " + intFunction.apply(19));

        IntPredicate intPredicate = (value) -> {
            System.out.println("running test in IntPredicate");
            return value == 2;
        };
        System.out.println("IntPredicate result: " + intPredicate.test(3));

        IntSupplier intSupplier = () -> {
            System.out.println("running getAsInt in IntSupplier");
            return 100;
        };
        System.out.println("IntSupplier result: " + intSupplier.getAsInt());

        IntToDoubleFunction intToDoubleFunction = (value) -> {
            System.out.println("running applyAsDouble in IntToDoubleFunction");
            return (double) value;
        };
        System.out.println("IntToDoubleFunction result: " + intToDoubleFunction.applyAsDouble(234));

        IntToLongFunction intToLongFunction = (value) -> {
            System.out.println("running applyAsLong in IntToLongFunction");
            return (long) value;
        };
        System.out.println("IntToLongFunction result: " + intToLongFunction.applyAsLong(567898765));

        IntUnaryOperator intUnaryOperator = (operand) -> {
            System.out.println("running applyAsInt in IntUnaryOperator");
            return operand * operand;
        };
        System.out.println("IntUnaryOperator result: " + intUnaryOperator.applyAsInt(9));

        LongBinaryOperator longBinaryOperator = (a, b) -> a + b;
        System.out.println("LongBinaryOperator result: " + longBinaryOperator.applyAsLong(50L, 100L));

        LongConsumer longConsumer = value -> System.out.println("LongConsumer consumed: " + value);
        longConsumer.accept(9999L);

        LongFunction<String> longFunction = value -> "Value: " + value;
        System.out.println("LongFunction result: " + longFunction.apply(150L));

        LongPredicate longPredicate = value -> value > 0;
        System.out.println("LongPredicate result: " + longPredicate.test(45L));

        LongSupplier longSupplier = () -> 123L;
        System.out.println("LongSupplier result: " + longSupplier.getAsLong());

        LongToDoubleFunction longToDoubleFunction = value -> value * 2.5;
        System.out.println("LongToDoubleFunction result: " + longToDoubleFunction.applyAsDouble(20L));

    }
}
