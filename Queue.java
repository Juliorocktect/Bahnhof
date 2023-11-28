public class Queue<T>{
  class Node{
    private Node nextNode;
    private T content;

    public Node(T pContent){
      nextNode = null;
      content = pContent;
    }
    public T getContent()
    {
      return content;
    }

    public Node getNextNode(){return nextNode;}

    public void setNextNode(Node pNextNode){
      nextNode = pNextNode;
    }
  }
  private Node head;
  private Node tail;

  public Queue(){
    head = null;
    tail = null;
  } 
  public void enqueue(T pContent){
    if(isEmpty()){
      head = new Node(pContent);
      tail = head;
    }
    else{
    Node neuerNode = new Node(pContent);
    tail.setNextNode(neuerNode);
    tail = neuerNode;
    }
  }
  public boolean isEmpty(){
    return head == null;
  }
  public void dequeue(){
    if(!isEmpty()){
      head = head.getNextNode();
    }
  }
  public T front(){
    return head.getContent();
  }
}
