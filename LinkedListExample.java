public class LinkedListExample {

    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();
        list.head = new Node(100);
        Node secondNode = new Node(200);
        Node thirdNode = new Node(300);

        list.head.next = secondNode;
        secondNode.next = thirdNode;

        //display list
        Node n = list.head;
        while (n != null){
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}
