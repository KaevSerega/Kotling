package Lisen1;

import java.util.ArrayList;

class Scratch {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(2532);
        numbers.add(533);
        numbers.add(344);
        int i=0;
        // вот это называется улучшенный цикл for
        // или еще for each
        // смысл в том, что тут нет использования индекса

        for (Integer num : numbers) {
            System.out.println(num);
        }

        // этот цикл просто проходит от начала до конца ArrayList в данном случае
        // и тебе не надо отслеживать индекс

    }
}

public class Test {
    public static void main(String[] args) {

    }
}

