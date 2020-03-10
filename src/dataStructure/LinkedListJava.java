package dataStructure;

public class LinkedListJava {
    public static void main(String[] args) {
        LinkedList numbers = new LinkedList();
        numbers.addFirst(10);
        numbers.addFirst(99);
        numbers.addFirst(28);
        numbers.addFirst(55);
        numbers.addFirst(32);
        numbers.addLast(51);
        numbers.addLast(76);
        numbers.addLast(12);
        numbers.addLast(21);

        System.out.println(numbers.toString());
        System.out.println("List's Size: " + numbers.size());

        numbers.removeFirst();

        numbers.remove(3);
        numbers.remove(5);

        System.out.println(numbers.toString());
        System.out.println("List's Size: " + numbers.size());

    }
}
