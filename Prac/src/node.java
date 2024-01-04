//two way of linkedlist java collection and mannual or static and non-static
//
public class node {
//    int value;
//    node next;
//
//
//    node(int value);
//    {
//
//    }
}

/*
two way of linkedlist java collection and mannual or static and non-static
ChatGPT
In Java, there are multiple ways to create and work with linked lists. Two common approaches involve using the built-in LinkedList class from the java.util package or manually implementing a linked list. Additionally, you can create linked lists in a static or non-static manner. Let's explore both approaches:

1. Using LinkedList class (Dynamic Linked List):
The LinkedList class in the Java Collections Framework provides a dynamic implementation of a linked list. It allows you to add, remove, and manipulate elements easily.

java
Copy code
import java.util.LinkedList;

public class DynamicLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> dynamicList = new LinkedList<>();
        dynamicList.add("Apple");
        dynamicList.add("Banana");
        dynamicList.add("Orange");

        // Perform operations on dynamic linked list
        System.out.println(dynamicList);
    }
}
2. Manually implementing a linked list (Static or Non-static):
Non-static (Instance) Linked List:
java
Copy code
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ManualLinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // Perform operations on non-static linked list
        printLinkedList(head);
    }

    private static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
Static (Class-level) Linked List:
java
Copy code
class Node {
    int data;
    static Node head;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class StaticLinkedListExample {
    public static void main(String[] args) {
        Node.head = new Node(1);
        Node.head.next = new Node(2);
        Node.head.next.next = new Node(3);

        // Perform operations on static linked list
        printLinkedList();
    }

    private static void printLinkedList() {
        Node current = Node.head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
In the manual implementation, you can create linked lists either as non-static (instance-level) where each instance has its own list or as static (class-level) where there is a shared list among all instances of the class. Choose the approach based on your specific requirements.






 */
