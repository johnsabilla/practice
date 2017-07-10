/**
 * Created by johnsabilla on 7/9/2017.
 */
public class Node
{
    //Properties
    Node next;
    int data;


    //Constructors
    public Node(int data){
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }


    /**
     * getter for data
     * @return
     */
    public int getData(){
        return data;
    }

    /**
     * getter for node next
     * @return
     */
    public Node getNext(){
        return next;
    }

    /**
     * Setter for data
     * @param data
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Setter for node next
     * @param next
     */
    public void setNext(Node next) {
        this.next = next;
    }

}
