import java.util.ArrayList;

public class Stack {
  private ArrayList<String> stackList;

  public Stack() {
    this.stackList = new ArrayList<>();
  }

  public boolean isEmpty() {
    return stackList.isEmpty();
  }

  public void add(String value) {
    stackList.add(value);
  }

  public ArrayList<String> values() {
    return stackList;
  }

  public String take() {
    return stackList.remove(stackList.size() - 1);
  }
}
