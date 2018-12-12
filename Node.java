public class Node{
  private int data;
  private Node next,prev;
  public Node(int data, Node next, Node prev){
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
  public int getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }
  public Node getPrev(){
    return prev;
  }
  public void setData(){
    this.data = data;
  }
  public void setNext(){
    this.next = next;
  }
  public void setPrev(){
    this.prev = prev;
  }
}
