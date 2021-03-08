package dataStructure;

public class LinkedListPractice {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedListPractice list = new LinkedListPractice();
        list.add(new LinkedNode(1));
        list.add(new LinkedNode(2));
        list.add(new LinkedNode(3));

        list.print();
        list.reverse();

        list.print();
    }

    private void print() {
        LinkedNode nodeToPrint = this.head;
        while(nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

    /**
     * TODO 단일 연결 리스트를 뒤집는 함수를 구현하라.
     *  예) 1 -> 2 -> 3   =>   3 -> 2 -> 1
     * @return
     */
    private void reverse() {

    }
}
