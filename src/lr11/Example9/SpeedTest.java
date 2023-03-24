package lr11.Example9;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpeedTest {
    private static final int ELEMENTS_COUNT = 100000;
    private static final int ELEMENTS_COUNT2 = 100;
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.println("Время выполнения операции добавление элемента в начало ArrayDeque: " + getInsertionTimeAtStartArrayDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале ArrayDeque: " + getDeletionTimeAtStartArrayDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец ArrayDeque: " + getInsertionTimeAtEndArrayDeque(arrayDeque) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце ArrayDeque: " + getDeletionTimeAtEndArrayDeque(arrayDeque) + " мс");
        System.out.println("Время получения элемента по индексу ArrayDeque: " + getSearchTimeArrayDeque(arrayDeque) + "нс");
        System.out.println();
        System.out.println("Время выполнения операции добавление элемента в начало LinkedList: " + getInsertionTimeAtStart(linkedList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале LinkedList: " + getDeletionTimeAtStart(linkedList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец LinkedList: " + getInsertionTimeAtEnd(linkedList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце LinkedList: " + getDeletionTimeAtEnd(linkedList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в середину LinkedList: " + getInsertionTimeAtMiddle(linkedList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в середине LinkedList: " + getDeletionTimeAtMiddle(linkedList) + " мс");
        System.out.println("Время получения элемента по индексу LinkedList: " + getSearchTime(linkedList) + " мс");
        System.out.println();
        System.out.println("Время выполнения операции добавление элемента в начало ArrayList: " + getInsertionTimeAtStart(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в начале ArrayList: " + getDeletionTimeAtStart(arrayList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в конец ArrayList: " + getInsertionTimeAtEnd(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в конце ArrayList: " + getDeletionTimeAtEnd(arrayList) + " мс");
        System.out.println("Время выполнения операции добавление элемента в середину ArrayList: " + getInsertionTimeAtMiddle(arrayList) + " мс");
        System.out.println("Время выполнения операции удаление элемента в середине ArrayList: " + getDeletionTimeAtMiddle(arrayList) + " мс");
        System.out.println("Время получения элемента по индексу ArrayList: " + getSearchTime(arrayList) + " мс");
    }

    public static long getInsertionTimeAtStartArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addFirst(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtEndArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.addLast(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }


    public static long getInsertionTimeAtStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getInsertionTimeAtMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.add(list.size() / 2, i);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtStartArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.removeFirst();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtEndArrayDeque(ArrayDeque<Integer> arrayDeque) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            arrayDeque.removeLast();
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtStart(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(0);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtEnd(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(list.size() - 1);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getDeletionTimeAtMiddle(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < ELEMENTS_COUNT; i++) {
            list.remove(list.size() / 2);
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long getSearchTime(List<Integer> list) {
        for(int i = 0; i < ELEMENTS_COUNT2; i++) {
            list.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT2; i++) {
            list.get(i);
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static long getSearchTimeArrayDeque(ArrayDeque<Integer> arrayDeque) {
        for(int i = 0; i < ELEMENTS_COUNT2; i++) {
            arrayDeque.add(i);
        }
        long startTime = System.nanoTime();
        for (int i = 0; i < ELEMENTS_COUNT2; i++) {
            arrayDeque.peek();
        }
        long endTime = System.nanoTime();
        return endTime - startTime;
    }
}
