package MyDataStructure;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(3);
        list.add(4);
        System.out.println("LinkedList get(0): " + list.get(0));
        System.out.println("LinkedList get(1): " +list.get(1));

        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("Stack peek: " + stack.peek());

        MyQueue<Integer> queue = new MyQueue<>();
        queue.offer(3);
        queue.offer(4);
        System.out.println("Queue dequeue: " + queue.dequeue());
        System.out.println("Queue peek: " + queue.peek());
    }
}
