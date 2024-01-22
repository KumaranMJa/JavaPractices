package datastructurres;
import java.util.*;
public class linkedList{
    Node head; 
    linkedList(){
        head=null; //constructor class with head as null
    }
    class Node{
        int data;
        Node next; //next representing the node
        Node(int val){
            data = val;
            next = null;
        }
    }
    void insertAtBegining(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }
        else{
            newNode.next=head;
            head = newNode;
        }
    }
    void display(){
        Node temp = head; //copying head refference as temp and moving temp till null
        while(temp != null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    void insertAtPos(int pos, int val) throws Exception{
        if(pos==0){
            insertAtBegining(val);
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp==null){
                throw new Exception("Ivalid Position"+pos);
            }
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

}
class demo{
    public static void main(String[] args) {
        linkedList list = new linkedList();
    }
}