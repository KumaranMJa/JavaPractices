package datastructurres;
import java.util.*;
class arrayList {
    static  final int initialCapacity = 16;
    private int [] arr;
    private int size=0;
    private int capacity;
    arrayList(){
        arr = new int[initialCapacity];
        capacity=initialCapacity;
    }
    private void expandSize(){
        capacity*=2;
        arr = java.util.Arrays.copyOf(arr,capacity);
    }
    public void insertAtEnd(int val){
        if(size==capacity){
            expandSize();
        }
        arr[size]=val;
        size++;
    }
    public void display(){
        if(size==0){
            System.out.println("Array List is empty");
        }
        else{ 
            for(int i=0;i<size;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void delAtPos(int pos){
        for(int i=pos+1;i<size-1;i++){
            arr[i-1]=arr[i];
        }
        size--;
        if(capacity>initialCapacity && capacity > size*3){
            shrinkSize();
        }
    }
    private void shrinkSize(){
        capacity/=2;
        arr = java.util.Arrays.copyOf(arr,capacity);
    }
    public void insertAtPos(int val,int pos){
        if(size==capacity){
            expandSize();
        }
        for(int i=size-1;i>=pos;i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=val;
        size++;
    }
    public void arrSize(){
        System.out.println(arr.length);
    }
}
    class Main{
    public static void main(String[] args) {
        int pos,val,choice;
        Scanner no = new Scanner(System.in);
        arrayList list = new arrayList();
        while(true){
            System.out.println("1.Enter value at end");
            System.out.println("2.Display ArrayList");
            System.out.println("3.Delete at index positon");
            System.out.println("4.Insert at specific position");
            System.out.println("5.Size of ArrayList");
            System.out.println("6.Exit");
            System.out.println("Enter the choice:");
            choice = no.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the value");
                    val = no.nextInt();
                    list.insertAtEnd(val);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter the pos to delete");
                    pos = no.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position");
                        break;
                    }
                    else{
                        list.delAtPos(pos);
                    }
                    break;
                case 4:
                    System.out.println("Enter the value");
                    val = no.nextInt();
                    System.out.println("Enter the position");
                    pos = no.nextInt();
                    if(pos<0){
                        System.out.println("Invalid position");
                        break;
                    }
                    else{
                        list.insertAtPos(val,pos);
                    }
                    break;
                case 5:
                    list.arrSize();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice");

            }
        }
    }
}
