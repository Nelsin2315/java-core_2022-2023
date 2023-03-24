package lr11.Example8;

import java.util.Map;

public class Example8 {

    public static void main(String[] args) {
        Node LinkedList = new Node();

        LinkedList.createHead(new int[]{1,2,3});
        System.out.println(LinkedList.toString());

        LinkedList.createTail(new int[]{3,2,1});
        System.out.println(LinkedList.toString());

        LinkedList.AddFirst(-2);
        System.out.println(LinkedList.toString());

        LinkedList.AddLast(10);
        System.out.println(LinkedList.toString());

        LinkedList.Insert(100,3);
        System.out.println(LinkedList.toString());

        LinkedList.RemoveFirst();
        System.out.println(LinkedList.toString());

        LinkedList.RemoveLast();
        System.out.println(LinkedList.toString());

        LinkedList.Remove(3);
        System.out.println(LinkedList.toString());

        LinkedList.createHeadRec(5);
        System.out.println(LinkedList.toStringRec(LinkedList.head));

        LinkedList.createTailRec(4);
        System.out.println(LinkedList.toStringRec(LinkedList.head));
    }
}
class Node {
    protected int value;
    protected Node next;
    protected Node head;

    public Node getNext() {
        return next;
    }

    public int getValue() {
        return value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node() {
    }

    protected void createHead(int[] values) {
        Node head = new Node(values[0], null);
        Node tail = head;
        for (int i = 1; i < values.length; i++) {
            tail.next = new Node(values[i], null);
            tail = tail.next;
        }
        this.head = head;
        System.out.print("Формирование односвязного списка от головы: ");
    }

    protected void createTail(int[] values) {
        Node head = null;
        for (int i = values.length - 1; i >= 0; i--) {
            head = new Node(values[i], head);
        }
        this.head = head;
        System.out.print("Формирование односвязного списка от хвоста: ");
    }


    public String toString() {
        Node ref = head;
        String toString = "";
        while (ref != null) {
            toString += " " + ref.value;
            ref = ref.next;
        }
        return toString;
    }

    protected void AddFirst(int head) {
        this.head = new Node(head, this.head);
        System.out.print("Добавление элемента в начало списка: ");
    }

    protected void AddLast(int tail) {
        Node newTail = new Node(tail, null);
        Node ref = this.head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
        System.out.print("Добавление элемента в конец списка: ");
    }

    protected void Insert(int middle, int queue) {
        Node newNode = new Node(middle, null);
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
        System.out.print("Добавление элемента за № " + queue + " списка:");
    }

    protected void RemoveFirst() {
        this.head = this.head.next;
        System.out.print("Удаление элемента из головы списка:");
    }

    protected void RemoveLast() {
        Node ref = this.head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
        System.out.print("Удаление элемента из хвоста списка:");
    }

    protected void Remove(int queue) {
        Node ref = this.head;
        int k = 1;
        while (ref.next != null && (k < queue)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
        System.out.print("Удаление элемента под № " + queue + " списка:");
    }

    Node createHeadRec(int value) {
        if (value == 0) {
            System.out.print("Формирование односвязного списка от головы с помощью рекурсии: ");
            return null;
        }
        return this.head = new Node(value, createHeadRec(value-1));
    }
    int createTailRec(int value){
        if (value ==0) {
            System.out.print("Формирование односвязного списка от хвоста с помощью рекурсии:");
            Node head = null;
            this.head = head;
            return 0;
        }
        head = new Node(createTailRec(value - 1), head);
        return value;
    }

    public String toStringRec(Node head) {
        if (head == null) {
            return "";
        }
        return head.getValue()+" "+toStringRec(head.getNext());
    }

}
