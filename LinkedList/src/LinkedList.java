/**
 * Created by johnsabilla on 7/9/2017.
 */
public class LinkedList
{
    Node head;
    int count;

    public LinkedList(){
        head = null;
        count = 0;
    }

    public LinkedList(Node head) {
        this.head = head;
        count = 1;
    }

    /**
     *
     * @param data
     */
    public void add(int data) {
        Node node = new Node(data);

        if (count == 0){
            head = node;
        } else {
            Node current = head;

            //Iterate through the list
            while (current.getNext() != null) {
                current = current.getNext();
            }
            //set the last node's next to be our new node
            current.setNext(node);
        }
        //increment our node count
        count++;
    }

    /**
     *
     * @param index
     * @return
     */
    public int get(int index) {

        if(index <= 0){
            return -1;
        }

        Node current = head;

        for(int x = 1; x < index; x++) {
            current = current.getNext();
        }
        return current.getData();
    }

    /**
     *
     * @return
     */
    public int size(){
        return count;
    }

    /**
     *
     * @return
     */
    public boolean isEmpty(){
        return (head == null);
    }

    /**
     *
     */
    public void remove(){
        Node current = head;

        if(count == 1) {
            head = null;
        }else {
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
        }
        count--;
    }


    public static void main(String[] args){
        Node node = new Node(5);
        LinkedList linkedList = new LinkedList(node);

        System.out.println(linkedList.get(1));
    }
}
