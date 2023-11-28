public class Bahnhof {
  private Stack<Wagon> a;
  private Stack<Wagon> b;
  private Stack<Wagon> c;

  public Bahnhof() {
    a = new Stack<>();
    b = new Stack<>();
    c = new Stack<>();
  }

  public void setA(Stack<Wagon> a) {
    this.a = a;
  }

  public void vonAzuB() {
    b.push(a.top());
    a.pop();
  }

  public void vonAzuC() {
    c.push(a.top());
    a.pop();
  }

  public void vonBzuA() {
    a.push(b.top());
    b.pop();
  }

  public void vonBzuC() {
    c.push(b.top());
    b.pop();
  }

  public void vonCzuB() {
    b.push(c.top());
    c.pop();
  }

  public void printA() {
    Stack<Wagon> tmp = new Stack<>();
    while (!a.isEmpty()) {
      System.out.println(a.top().getWeight());
      tmp.push(a.top());
      a.pop();
    }
    a = tmp;
  }

  public void vonCzuA() {
    a.push(c.top());
    c.pop();
  }

  public void alleNachA() {
    while (!b.isEmpty()) {
      a.push(b.top());
      b.pop();
    }
    while (!c.isEmpty()) {
      a.push(c.top());
      a.pop();
    }
  }

  public void sortiere() {
    vonAzuB();
    Wagon vonB = b.top();
    boolean fertig = false;
    while (!fertig) {
      while (!a.isEmpty()) {
        if (a.top().getWeight() > vonB.getWeight()) {
          vonAzuC();
        } else {
          vonAzuB();
        }
      }
      if(c.isEmpty()){
        fertig = true;
      }
      alleNachA();
    }
  }
}
