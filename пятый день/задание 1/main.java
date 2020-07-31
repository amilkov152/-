package Demo;

public class  main {
    public static void main(String[] args) {
        //Тест 1
        LList<String> ll = new LList<>();
        ll.add("Hello");
        ll.add("world");
        System.out.println(ll.get(0) + " " + ll.get(1));
        //Тест 2
        LList<Integer> ll2 = new LList<>();
        ll2.add(5);
        ll2.add(23);
        System.out.println(ll2.get(0) + " " + ll2.get(1));
        //Тест 3
        LList<Boolean> ll3 = new LList<>();
        for(int i = 0; i < 5; ++i)
            if(i%2 == 0)
                ll3.add(true);
            else
                ll3.add(false);
            for(int i = 0; i < ll3.size();++i)
                System.out.print(ll3.get(i) + " ");
    }
}
class Node <T> {
    T data;
    Node next;

    public Node(T item) {
        this.data = item;
    }
}

class  LList <T> {
    private Node root;

    public void add(T obj) {
        if(obj == null)
            return;
        Node node = new Node(obj);
        Node last = findLast();

        if(last == null){
            root = node;
        }
        else{
            last.next = node;
        }
    }

    public int size() {
        if(root == null)
            return 0;

        int count = 1;
        Node currentNode = root;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            count++;
        }

        return count;
    }

    public Object get (int id) {
        if(id < size() && id >= 0 && root != null) {
            Node  soughtNode = root;
            int cnt = 0;
            while (cnt !=id) {
                soughtNode = soughtNode.next;
                cnt++;
            }
            return soughtNode.data;
        }
        else return null;
    }

    private Node findLast() {
        if(root == null)
            return null;
        else{
            Node currentNode = root;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            return currentNode;
        }
    }
}