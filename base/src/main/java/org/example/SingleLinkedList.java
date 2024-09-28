package org.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingleLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public Node add(int data){
        Node newNode= new Node(data);
        newNode.next=head;
        head=newNode;
        return head;
    }

    public void delete(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        System.out.println("deleted the data:: "+head.data+" Successfully");
        Node temp=head.next;
        head=temp;
    }
    public void display(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        System.out.println("List:: ");
        while (temp != null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String [] args){
        SingleLinkedList list=new SingleLinkedList();
        list.display();
        list.delete();
        list.add(10);
        list.add(15);
        list.add(4);
        list.add(27);
        list.add(9);

        list.display();
        list.delete();
        list.delete();
        list.display();
    }
}
