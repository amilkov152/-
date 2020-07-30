package Demo;

public class  main {
    public static void main(String[] args) {
        //testing
        LList ll = new LList();
        for(int i = 0; i < 10; ++i){
            ll.add(i+" day");
        }
        System.out.println(ll.size());
        for(int i = 0; i < ll.size()+5; ++i) //error
        {
            try {
                System.out.println(ll.get(i));
            } catch (OutRangeException e){
                   System.out.println("Выход за пределы массива");
            }
        }
    }
}

    class OutRangeException extends RuntimeException{
        public OutRangeException(String message) {
            super(message);
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

        public Object get (int id) throws OutRangeException {
            if( root != null) {
                Node  soughtNode = root;
                int cnt = 0;

                while (cnt != id) {
                    if(soughtNode.next != null) {
                        soughtNode = soughtNode.next;
                        cnt++;
                    }
                    else {
                        throw new OutRangeException("OutRange");
                    }
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

