class Node {
    Node next;
}

public class Main {
    public static void main(String[] args) {
        Node a = new Node();    // Root Set
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();    // 누구도 d를 참조하지 않음 → 삭제 대상

        a.next = b;
        b.next = c;
    }
}