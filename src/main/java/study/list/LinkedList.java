package study.list;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 25.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class LinkedList  {
    private Node head;
    private Node tail;
    private int size;

    private class Node{
        private Object data;
        private Node next;
        public Node(Object input){
            this.data = input;
            this.next = null;
        }
        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input){
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if(head.next == null){
            tail = head;
        }
    }
}
