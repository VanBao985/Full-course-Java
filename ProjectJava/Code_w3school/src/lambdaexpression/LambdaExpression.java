package lambdaexpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpression {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24); numbers.add(46); numbers.add(46); numbers.add(94);
        numbers.add(44); numbers.add(24); numbers.add(48); numbers.add(4);
        numbers.forEach( (n) -> {
            System.out.println(n);
        });
        Consumer<Integer> method = (n) -> {
            System.out.println(n);
        };
        numbers.forEach(method);
    }
}
