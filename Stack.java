public class Stack<T> {
  private class Node {
    private Node nextNode;
    private T content;

    public Node(T pContent) {
      nextNode = null;
      content = pContent;
    }

    public void setNextNode(Node pNextNode) {
      nextNode = pNextNode;
    }

    public T getContent() {
      return content;
    }

    public Node getNextNode() {
      return nextNode;
    }
  }

  private Node head;

  public Stack() {
    head = null;
  }

  public T top() {
    return head.getContent();
  }

  public void pop() {
    if (!isEmpty()) {
      head = head.getNextNode();
    }
  }

  public void push(T pContent) {
    if (isEmpty()) {
      head = new Node(pContent);
    } else {
      Node neuerNode = new Node(pContent);
      neuerNode.setNextNode(head);
      head = neuerNode;
    }
  }

  public boolean isEmpty() {
    return head == null;
  }
}
