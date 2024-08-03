import java.util.*;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Detectcycle {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node thrid = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);
        head.next = second;
        second.next = thrid;
        thrid.next = fourth;
        fourth.next = fifth;
        fifth.next = head;
        if(fifth.next == head){
        System.out.println(head.data);}}
        }


