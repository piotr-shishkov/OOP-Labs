package com.company;

public class MediumLevel {
    public static void main(String[] args) {
        //Creating Queues
        Queue q1 = new Queue();
        Queue q2 = new Queue(2);

        System.out.println("First Queue (No Max Length)");
        //Pushing items to first Queue
        q1.Push(2);
        q1.Push(4);
        q1.Push(8);
        //Pop last item
        q1.Pop();
        //Advanced: Check Full and Empty
        q1.CheckIfEmpty();
        q1.CheckIfFull();

        System.out.println("\nSecond Queue (Max Length - 2)");
        //Pushing items to second Queue
        q2.Push(12);
        q2.Push(24);
        q2.Push(36); //Not be pushed 'cause Queue max length equal 2
        //Pop last item
        q2.Pop();
        //Advanced: Check Full and Empty
        q2.CheckIfEmpty();
        q2.CheckIfFull();
    }
}

class Queue{
    public int Length;
    public int MaxLength;
    public Node Front, Rear;

    //Constructor with no params
    public Queue(){
        MaxLength = Integer.MAX_VALUE;
        Length = 0;
        Front = Rear = null;
    }

    //Constructor with maxLength
    public Queue(int maxLength){
        MaxLength = maxLength;
        Length = 0;
        Front = Rear = null;
    }

    //Push item to Queue
    public void Push(int value){
        if(Length == MaxLength){
            return;
        }
        Node node = new Node(value);
        if(isEmpty()){
            Front = node;
        }
        else {
            Rear.SetNextNode(node);
        }
        Rear = node;
        Length++;
    }

    //Pop item from Queue
    public void Pop() {
        if(isEmpty()){
            System.out.println("Empty queue");
            return;
        }
        int result = Front.GetData();
        Front = Front.GetNextNode();
        Length--;
        if(isEmpty()){
            Rear = null;
        }
        System.out.println(result);
    }

    //Check if Queue empty
    private boolean isEmpty(){
        return Length == 0;
    }

    //Advanced: Check queue for emptiness
    public void CheckIfEmpty(){
        if(Length == 0) {
            System.out.println("Queue - Empty!");
            return;
        }
        else {
            System.out.println("Queue - Not Empty!");
        }
    }

    //Advanced: Check queue for fullness
    public void CheckIfFull(){
        if(MaxLength == Integer.MAX_VALUE) {
            System.out.println("This queue cannot be full");
            return;
        }
        else if(MaxLength == Length){
            System.out.println("Queue - Full!");
        }
        else {
            System.out.println("Queue - Not Full!");
        }

    }
}

class Node {
    public int Value;
    public Node NextNode;

    //Node Constructor with data param
    public Node(int value){
        Value = value;
    }

    //Get data from Node
    public int GetData() {
        return Value;
    }

    //Get next node
    public Node GetNextNode() {
        return NextNode;
    }

    //Set next node
    public void SetNextNode(Node nextNode) {
        NextNode = nextNode;
    }
}