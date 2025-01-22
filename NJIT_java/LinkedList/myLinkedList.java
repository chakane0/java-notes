public class myLinkedList {
    Node head;
    int size = 0;

    static class Node {
        int val;
        Node next;
        Node(int value) {
            this.val = value;
        }
    }

    public void pushNode(int num) {
        Node newNode = new Node(num);
        if(head == null) {
            head = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    public void appendNode(int num) {
        Node newNode = new Node(num);
        Node tempNode = head;
        if(head == null) {
            head = newNode;
            size++;
            return;
        }
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
        size++;
    }

    public void pushAtIndex(int num, int index) {
        Node newNode = new Node(num);
        Node tempNode = head;

        if(index <= 0 || head == null) {
            pushNode(num);
            return;
        }

        if(index >= size) {
            appendNode(num);
            return;
        }

        for(int i = 0; i < index-1; i++) {
            tempNode = tempNode.next;
        }
        // were at 7 here
        Node tmpRef = tempNode.next;
        tempNode.next = newNode;
        newNode.next = tmpRef;
        size++;
        
    }

    public void deleteAtIndex(int index) {
        Node tmpNode = head;
        if(head == null) {
            return;
        }

        if(index == 0) {
            head = head.next;
            size--;
            return;
        }

        if(index >= size || index <= 0) {
            System.out.println(size);
            System.out.println("out of bounds index was given");
            return;
        }
        
        for(int i = 0; i < index-1; i++) {
            tmpNode = tmpNode.next;
        }
        System.out.println("tmNode last: " + tmpNode.val);
        tmpNode.next = tmpNode.next.next;
        size--;
    }

    public int get(int index) {
        Node tmpNode = head;
        if(index > size || index <= 0) {
            System.out.println("out of bounds index was given");
            return -9999;
        }

        if(head == null) {
            return tmpNode.val;
        }

        for(int i = 0; i < index; i++) {
            tmpNode = tmpNode.next;
        }
        return tmpNode.val;

    }

    public void printList() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val+"\n");
    }
}
