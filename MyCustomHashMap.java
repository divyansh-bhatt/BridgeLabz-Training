public class MyCustomHashMap {
    static class Node{
        int key;
        int value;
        Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
            next=null;
        }
    }
    Node[]bucket;
    public MyCustomHashMap(){
        bucket=new Node[SIZE];
    }
    public static final int  SIZE=10;
    public int hash(int key){return key%SIZE;}

    public void put(int key, int value){
        int index=hash(key);
        Node head=bucket[index];
        Node current=head;
        while(current!=null){
            if(current.key==key){
                current.value=value;
                return;
            }
            current=current.next;
        }
        Node newNode= new Node(key,value);
        bucket[index]=newNode;
    }
    public int get(int key){
        int index=hash(key);
        Node current= bucket[index];
        while(current!=null){
            if(current.key==key)
            return current.value;
        }
        return -1;
    }
    public void remove(int key) {
        int index = hash(key);
        Node current = bucket[index];
        Node prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev == null) {
                    bucket[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev  =current;
            current = current.next;
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Node node : bucket){
            sb.append(node.key+" "+node.value).append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        MyCustomHashMap myCustomHashMap = new MyCustomHashMap();
        myCustomHashMap.put(1,10);
        myCustomHashMap.put(2,5);
        myCustomHashMap.get(1);
        myCustomHashMap.remove(2);
        System.out.println(myCustomHashMap);
    }
}
