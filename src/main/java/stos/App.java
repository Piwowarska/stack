package stos;


import java.util.Collections;
import java.util.Stack;

public class App {
    public static void main(String[] args) {

        Stack<Integer> stackOfCards = new Stack<>();
        methodPush(20, stackOfCards);
        methodPush(11, stackOfCards);
        methodPush(7, stackOfCards);
        methodPush(4, stackOfCards);
        System.out.println("Stack => " + stackOfCards);
        System.out.println();

        peekMin(stackOfCards);
        methodPop(stackOfCards);
        peekMin(stackOfCards);
        methodPeek(stackOfCards);
        peekMin(stackOfCards);

    }

    public static void methodPush(int a, Stack<Integer> stackOfCards) {
        stackOfCards.push(a);
    }

    public static void methodPop(Stack<Integer> stackOfCards) {
        Integer cardAtTop = stackOfCards.pop();
        System.out.println("Stack.pop() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
    }

    public static void methodPeek(Stack<Integer> stackOfCards) {
        Integer cardAtTop = stackOfCards.pop();
        cardAtTop = stackOfCards.peek();
        System.out.println("Stack.peek() => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
    }

    public static void peekMin(Stack<Integer> stackOfCards) {
        System.out.println("Minimum value on the stack => " + (int) Collections.min(stackOfCards));

    }
}
