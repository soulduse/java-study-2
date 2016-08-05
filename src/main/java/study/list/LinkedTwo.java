package study.list;

/**
 * Created by sould on 2016-04-20.
 */
public class LinkedTwo {
    // 첫번째 노드를 가리키는 필드
    private Node    head;
    private Node    tail;
    private int     size=0;

    private class Node{
        // 데이터 저장될 필드
        private Object data;

        // 다음 노드를 가리키는 필드
        private Node next;

        public Node(Object input){
            this.data = input;
            this.next = null;
        }

        // 노드의 내용을 쉽게 출력해서 확인해볼 수 있는 기능

        public String toString(){
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input){
        // 노드를 생성합니다.
        Node newNode = new Node(input);
        // 새로운 노드의 다음 노드로 해드를 지정합니다.
        newNode.next = head;
        // 헤드로 새로운 노드를 지정 합니다.
        head = newNode;
        size++;
        if(head.next == null)
            tail = head;
    }

    public void addLast(Object input){
        // 노드를 생성합니다.
        Node newNode = new Node(input);
        // 리스트의 노드가 없다면 첫번째 노드를 추가하는 메소드를 사용합니다.
        if(size == 0){
            addFirst(input);
        } else {
            // 마지막 노드의 다음 노드로 생성한 노드를 지정합니다.
            tail.next = newNode;
            // 마지막 노드를 갱신합니다.
            tail = newNode;
            // 엘리먼트의 개수를 1 증가 시킵니다.
            size++;
        }
    }

    Node node(int index){
        Node x = head;
        for(int i=0; i<index; i++)
            x = x.next;
        return x;
    }

    public void add(int k, Object input){
        if(k == 0){
            addFirst(input);
        } else {
            Node temp1 = node(k-1);
            Node temp2 = temp1.next;
            Node newNode = new Node(input);
            temp1.next = newNode;
            newNode.next = temp2;
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }
}
