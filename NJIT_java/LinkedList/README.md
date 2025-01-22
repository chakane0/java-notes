# Linked List

# Methods
<ul>
    <li>pushNode(int number) -> void</li>
    <li>appendNode(int number) -> void</li>
    <li>pushAtIndex(int number, int index) -> void</li>
    <li>deleteAtIndex(int index) -> void</li>
    <li>get(int index) -> return int</li>
    <li>printList() -> void</li>
</ul>

# Motivation
This would be a basic way to show how classes work in Java. A linked list is simply a list of nodes. We can iterate through this array either forwards or backwards (singly linked list or doubly linked list). The difference between doing so, will depend on what you use this data structure for. 

# Implementation

```java 
public class SinglyLinkedList {
    Node head;
    int size = 0;

    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = value;
        }
    }
}
```

```java
public class DoublyLinkedList {
    Node head;

    static class Node {
        int val;
        Node next;
        Node prev;
        Node(int val) {
            this.val = value
        }
    }
}
```





