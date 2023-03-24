package lr11.Example4;

import org.w3c.dom.Node;

class Example4 {
    public static void main(String[] args) {

        Example41 node0 = new Example41(0, null);
        Example41 node1 = new Example41(1, null);
        Example41 node2 = new Example41(2, null);
        Example41 node3 = new Example41(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Example41 ref = node0;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

class Example41 {
    public int value;
    public Example41 next;

    Example41(int value, Example41 next) {
        this.value = value;
        this.next = next;
    }
}

