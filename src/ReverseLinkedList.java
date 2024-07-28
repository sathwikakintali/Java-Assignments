class Nodee {
    int data;
    Node next;

    public Nodee(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReverseLinkedList { // Corrected class name
    Node head;

    public void append(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        ReverseLinkedList linkedList = new ReverseLinkedList(); // Corrected class name
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.reverse();
        System.out.println("\nReversed linked list:");
        linkedList.display();
    }
}
