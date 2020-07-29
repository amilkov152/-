package Demo;

public class  main {
    public static void main(String[] args) {
        //Тестирование
        LList ll = new LList();
        for(int i = 0; i < 10; ++i){
            ll.add(i+" day");
        }
        System.out.println(ll.size());
        for(int i = 0; i < ll.size(); ++i){
            System.out.println(ll.get(i));
        }
        ll.add("header");
        ll.add("footer");
        System.out.println(ll.size());
        System.out.println(ll.get(10));
        System.out.println(ll.get(11));
        System.out.println(ll.get(12));
    }
}
    class Node {
        Object data;
        Node next;

        public Node(Object item) {
            this.data = item;
        }
    }

    class  LList {
        private Node root;

        public void add(Object obj) {
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

