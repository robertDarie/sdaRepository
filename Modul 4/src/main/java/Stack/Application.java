package Stack;


import Queue.Queues;

public class Application {

    public static void main(String[] args){
        Stack myStack = new Stack();
        Queues queue = new Queues();


        myStack.push(10);
        myStack.push(30);
        myStack.push(20);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());



        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(20);
        System.out.println(queue.dequeue()+ "");
        System.out.println(queue.dequeue()+ "");
        System.out.println(queue.dequeue()+ "");
    }

}
